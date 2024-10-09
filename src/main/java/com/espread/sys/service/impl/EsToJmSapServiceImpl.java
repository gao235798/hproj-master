package com.espread.sys.service.impl;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.constant.Global;
import com.espread.common.mapper.JsonMapper;
import com.espread.common.utils.HttpUtilTool;
import com.espread.sys.mapper.*;
import com.espread.sys.model.*;
import com.espread.sys.service.EsToJmSapService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class EsToJmSapServiceImpl implements EsToJmSapService {

    @Autowired
    private POPodetailsMapper poPodetailsMapper;
    @Autowired
    private POPomainMapper poPomainMapper;
    @Autowired
    private DispatchlistsMapper dispatchlistsMapper;
    @Autowired
    private SaSndetailDispMapper saSndetailDispMapper;
    @Autowired
    private InventoryMapper inventoryMapper;
    @Autowired
    private SOSOMainMapper sosoMainMapper;
    @Autowired
    private SOSODetailsMapper sosoDetailsMapper;
    @Autowired
    private DispatchListMapper DispatchListMapper;
    @Autowired
    private ComputationunitMapper computationunitMapper;

    /**
     * 向吉麦传输采购订单
     *
     * @param pOPomain 采购主表
     * @return
     */
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public SysQrtzLog toSalesOrder(POPomain pOPomain) {
        // 构建 SysQrtzLog 日志
        SysQrtzLog sysQrtLog = new SysQrtzLog("42");// 日志类型 -42：同步采购订单接口
        //添加jmSap接口写入采购订单路径
        String apiurl = Global.getJmSapurl() + "CREAT_SO";
        // 构建最终的 JSON
        JSONObject finalJson = new JSONObject();
        //获取采购订单明细
        Integer poid = pOPomain.getPoid();
        try {
            // 构建 T_HEADER
            JSONObject tHeader = new JSONObject();
            JSONArray headerItemArray = new JSONArray();
            JSONObject headerItem = new JSONObject();
            headerItem.put("EBELN", "");
            headerItem.put("VBELN", "");
            headerItem.put("AUART", "");
            headerItem.put("VKORG", "");
            headerItem.put("VTWEG", "");
            headerItem.put("SPART", "");
            headerItem.put("VKORP", "");
            headerItem.put("EDATU_VBAK", "");
            headerItem.put("BSTKD", "");
            headerItem.put("KTEXT_V", "");
            headerItem.put("DZTERM", "");
            headerItem.put("BSTKD_E", "");
            headerItem.put("ZTXT2", "");
            headerItem.put("ZTXT3", "");
            headerItem.put("ZTXT4", "");
            headerItem.put("ZTXT5", "");
            headerItem.put("KUNNR", "101089");
            headerItem.put("KUNWE", "101089");
            headerItem.put("ZTXT1", pOPomain.getCpoid());
            headerItemArray.put(headerItem);
            tHeader.put("item", headerItemArray);
            List poPodetails = poPodetailsMapper.selectByALLPOPodetailsXs(poid);
            // 构建 T_ITEM
            JSONObject tItem = new JSONObject();
            JSONArray itemArray = new JSONArray();
            for (Object poPodetail : poPodetails) {
                POPodetails pOPodetails = (POPodetails) poPodetail;// 获取每一个Example对象
                JSONObject item = new JSONObject();
                item.put("VBELN", "");
                item.put("KOEIN", "");
                item.put("KMEIN", "");
                item.put("WAERK", "");
                item.put("CURRENCY_KEY", "");
                item.put("ZVINCODE", "");
                item.put("ZTXT1", "");
                item.put("ZTXT2", "");
                item.put("ZTXT3", "");
                item.put("ZTXT4", "");
                item.put("ZTXT5", "");
                item.put("POSNR", String.valueOf(10 * pOPodetails.getIvouchrowno())); //行号
                item.put("MATNR", pOPodetails.getCinvcode()); //存货编码
                item.put("NETWR", pOPodetails.getItaxprice().toString()); //含税单价
                item.put("KPEIN", pOPodetails.getIquantity().toString()); //数量
                item.put("ETDAT", new SimpleDateFormat("yyyy-MM-dd").format(pOPodetails.getDarrivedate())); //发货日期
                itemArray.put(item);
            }
            tItem.put("item", itemArray);
            finalJson.put("T_HEADER", tHeader);
            finalJson.put("T_ITEM", tItem);
            //添加token验证
            String res = HttpUtilTool.toHttpsPost(apiurl, String.valueOf(finalJson), null,HttpUtilTool.GetTokenCredentials());
            // 解析 JSON 数据
            JSONObject jsonObject = new JSONObject(res);
            JSONObject sReturn = jsonObject.getJSONObject("S_RETURN");
            sysQrtLog.setCodeNo(poid.toString());
            sysQrtLog.setDescription(sReturn.getString("MES_TEXT"));
            sysQrtLog.setCreateDate(new Date());
            //如果成功修改采购订单主表标识
            if (sReturn.getString("MSG_TYPE").equals("S")) {
                poPomainMapper.updatePOPomainxs(poid, "success", sReturn.getString("MES_TEXT"));
                sysQrtLog.setLogStatus("1");
            }else{
                poPomainMapper.updatePOPomainxs(poid, "false", sReturn.getString("MES_TEXT"));
                sysQrtLog.setLogStatus("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysQrtLog;
    }

    /**
     * 向吉麦传输销售出货单
     *
     * @param da 销售出库单表头
     * @return SysQrtzLog
     */

    @SneakyThrows
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE01)
    public SysQrtzLog toPurchaseReceipt(DispatchList da) {
        // 构建 SysQrtzLog 日志
        SysQrtzLog sysQrtLog = new SysQrtzLog("43");// 日志类型 -43：同步销售出库单
        //添加jm写入销售订单出货单接口
        String apiurl = "http://192.168.1.29:55555/externalApi/syncDeliveryOrder";
        // 调用接口传输信息，没有认证信息
        String res = HttpUtilTool.toHttpsPost(apiurl, toPurchaseReceiptJson(da), null,HttpUtilTool.GetTokenCredentials());
        // 解析 JSON 数据
        JSONObject jsonObject = new JSONObject(res);
        // 设置 logStatus、codeNo 和 description 字段
        sysQrtLog.setCodeNo(da.getCdlcode());
        sysQrtLog.setDescription(jsonObject.getString("message"));
        sysQrtLog.setCreateDate(new Date());
        // 处理返回值
        if (jsonObject.getString("success").equals("true")) {
            // 如果成功，修改销售出库单表头标识
            DispatchListMapper.updatecdefine17(da.getDlid(),"success");
            sysQrtLog.setLogStatus("1");
        }else{
            DispatchListMapper.updatecdefine17(da.getDlid(),"false");
            sysQrtLog.setLogStatus("0");
        }
        return sysQrtLog;
    }
    /**
     * 返回日志信息
     *
     * @param messages 日志信息
     * @return 返回订单号
     */
    public String findNumber(String messages) {
        String orderNumber = "";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(messages);
        // 查找匹配的数字
        while (matcher.find()) {
            orderNumber = matcher.group();
            System.out.println(orderNumber);
        }
        return orderNumber;
    }

    /**
     * 拼接json表头
     * @param da
     * @return
     */
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public String toPurchaseReceiptJson(DispatchList da) throws JsonProcessingException {
        //去查询出库单表体-拼接json
        List<Map<String, Object>> jsonList = new ArrayList<>();
        // 创建 SimpleDateFormat 对象，指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, Object> jsonMap = new HashMap<>();
        //出库单表头
        jsonMap.put("deliveryNo", da.getCdlcode()); //发货退货单号
        jsonMap.put("purchaseOrganize", ""); //sap采购组织
        jsonMap.put("receiveDate", sdf.format(da.getDcreatesystime())); //单据日期
        jsonMap.put("supplierCode", da.getCcuscode()); //供应商编码
        jsonMap.put("supplierName", da.getCcusname());//供应商名称
        jsonMap.put("transportMode", da.getCsccode());//运输方式
        jsonMap.put("expressCompany", ""); //快递公司
        jsonMap.put("expressNumber", "");//快递单号
        jsonMap.put("driver", "");//司机
        jsonMap.put("phone", ""); //司机电话
        jsonMap.put("carNumber", "");//车牌号
        jsonMap.put("expectedDeliveryDate",sdf.format(da.getDdate())); //预计到货日期strftime("%Y-%m-%d %H:%M:%S")); //预计到货日期
        jsonMap.put("expectedDeliveryDate", ""); //预计到货日期strftime("%Y-%m-%d %H:%M:%S")); //预计到货日期
        jsonMap.put("expectedDeliveryTime", "");//预计到货时间
        jsonMap.put("receiverUser", "");//收货人
        jsonMap.put("receiverPhone", "");//收货人电话
        jsonMap.put("deliveryAddress", "");//发货地址
        jsonMap.put("remark", da.getCmemo()); //备注
        List<Map<String, Object>> detailList = new ArrayList<>();
        List<Dispatchlists> ds = dispatchlistsMapper.selectByDlid(da.getDlid());
        for (Dispatchlists o : ds) {
            // 第二层
            SOSOMain sosomain = sosoMainMapper.selectByCsocode(o.getCsocode()); //销售订单主表
            //销售订单明细
            Inventory inve = inventoryMapper.selectByCinvcode(o.getCinvcode()); //物料信息
            Computationunit computationunit = computationunitMapper.selectByPrimaryKey(inve.getCcomunitcode()); //单位信息
            //获取采购订单号
            SOSODetails sosoDetails = sosoDetailsMapper.selectByAutoid(o.getIsosid());
            List<Map<String, String>> vinList = new ArrayList<>();
            Map<String, Object> detailItem = new HashMap<>();
            detailItem.put("deliveryNo", da.getCdlcode()); //出库单单据号
            detailItem.put("lineNumber", o.getIrowno() * 10); //erp销售出库单单据行号
            detailItem.put("receiveOrganize", "");  //sap收货组织.
            detailItem.put("poCode", sosomain.getCdefine10()); //采购订单编号
            detailItem.put("poCodeDetailId", sosoDetails.getIrowno()); //采购订单行号
            detailItem.put("partCode", o.getCinvcode()); //物料编码
            detailItem.put("partDesc", o.getCinvname()); //物料描述
            detailItem.put("spec", inve.getCinvstd());       //规格型号!
            detailItem.put("poUnit", computationunit.getCcomunitname());   //计量单位
            detailItem.put("poQuantity", o.getIquantity());  //采购数量 --不一定正确
            detailItem.put("deliveryQuantity", o.getIquantity());  //送货数量
            detailItem.put("arrivalQuantity", o.getIquantity()); // 到货数量与送货数量一直
            detailItem.put("batch", "");  //批次取不到
            detailItem.put("boxQuantity", 1); //箱数
            detailItem.put("remark", o.getCmemo()); //备注
            detailItem.put("orderRemark", ""); //无
            List<SaSndetailDisp> sa = saSndetailDispMapper.selectByIdlsid(o.getIdlsid());
            for (SaSndetailDisp sas : sa) {
                // 第三层
                String vinCode = sas.getCinvsn();
                Map<String, String> vinItem = new HashMap<>();
                vinItem.put("deliveryNo", da.getCdlcode()); //送货单号
                vinItem.put("lineNumber", String.valueOf((o.getIrowno() * 10))); //行号
                vinItem.put("partCode", o.getCinvcode());  //物料编码
                vinItem.put("partDesc", o.getCinvname()); //物料描述
                vinItem.put("vin", sas.getCinvsn()); //vin码
                vinList.add(vinItem);
                detailItem.put("vinList", vinList);
            }
            detailList.add(detailItem);
        }
        jsonMap.put("detailList", detailList);
        jsonList.add(jsonMap);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        //格式化json
        String formattedJson = JsonMapper.jsonFormat(objectMapper.writeValueAsString(jsonList));
        return formattedJson;
    }
}
