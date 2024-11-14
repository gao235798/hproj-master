package com.espread.sys.service.impl;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.constant.Global;
import com.espread.common.utils.AppHttpCodeEnum;
import com.espread.common.utils.HttpXmlRequestUtil;
import com.espread.common.utils.ResponseResult;
import com.espread.sys.mapper.*;
import com.espread.sys.model.*;
import com.espread.sys.service.SysServicesServer;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class SysServicesServerImpl implements SysServicesServer {

    @Autowired
    private DispatchlistsMapper dispatchlistsMapper;
    @Autowired
    private DispatchListMapper dispatchListMapper;
    @Autowired
    private SOSODetailsMapper sosoDetailsMapper;
    @Autowired
    private  IaSummaryMapper iaSummaryMapper;
    @Autowired
    private StSnstateMapper stSnstateMapper;
    @Autowired
    CurrentStockMapper currentStockMapper;
    /**
     * 写入销售订单信息
     * @param soHeader
     * @param soItemList
     * @return
     */
    public SysQrtzLog toSaleOrder(Map<String, Object> soHeader, List<Map<String, Object>> soItemList){

        SysQrtzLog sysQrtLog= new SysQrtzLog("x");// 日志类型 -x{还没有定义}：写入销售订单
        String sender= Global.getSender();
        String formattedDate  = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String formattedDateTime  = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        //  String id =soHeader.get("EBELN").toString();
        try {
            String requestXml="<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>\n" +
                    "<ufinterface sender=\" "+sender+"\" " +
                    "receiver=\"u8\" roottag=\"saleorder\" docid=\"37151515\" " +
                    "proc=\"add\" codeexchanged=\"n\" exportneedexch=\"N\" paginate=\"1\" display=\"销售订单\" " +
                    "family=\"销售管理\" dynamicdate=\""+formattedDate+"\" maxdataitems=\"20000\" bignoreextenduserdefines=\"y\" " +
                    "timestamp=\"\" lastquerydate=\""+formattedDateTime+"\">"+
                    "<saleorder>\n" +
                    "    <header>\n" +
                    "      <id>1000000005</id>\n" +
                    "      <typecode>11</typecode>\n" +
                    "      <date>2019-07-25 00:00:00</date>\n" +
                    "      <code>HA20240320001</code>\n" +
                    "      <custcode>32031212</custcode>\n" +
                    "      <deptcode>203</deptcode>\n" +
                    "      <currency>人民币</currency>\n" +
                    "      <currencyrate>1</currencyrate>\n" +
                    "      <taxrate>13</taxrate>\n" +
                    "      <earnest>0</earnest>\n" +
                    "      <memo>null</memo>\n" +
                    "      <maker>DMS</maker>\n" +
                    "      <businesstype>普通销售</businesstype>\n" +
                    "      <disflag>0</disflag>\n" +
                    "      <define7>0</define7>\n" +
                    "      <define8>T</define8>\n" +
                    "      <define9>DMS</define9>\n" +
                    "      <define10>HA20240320001</define10>\n" +
                    "      <cusname>铜山区尚亿电动车经销部</cusname>\n" +
                    "      <dpredatebt>2019-07-25 00:00:00</dpredatebt>\n" +
                    "      <dpremodatebt>2019-07-25 00:00:00</dpremodatebt>\n" +
                    "    </header>\n" +
                    "\n" +
                    "    <body>\n" +
                    "      <entry>\n" +
                    "        <id>1000000005</id>\n" +
                    "        <inventorycode>10200010-61J-W01</inventorycode>\n" +
                    "        <preparedate>2019-07-25 00:00:00</preparedate>\n" +
                    "        <quantity>1</quantity>\n" +
                    "        <num>0</num>\n" +
                    "        <quotedprice>26820</quotedprice>\n" +
                    "        <unitprice>23734.5132743363</unitprice>\n" +
                    "        <taxunitprice>26820</taxunitprice>\n" +
                    "        <money>23734.51</money>\n" +
                    "        <tax>3085.49</tax>\n" +
                    "        <sum>26820</sum>\n" +
                    "        <discount>0</discount>\n" +
                    "        <natunitprice>23734.5132743363</natunitprice>\n" +
                    "        <natmoney>23734.51</natmoney>\n" +
                    "        <nattax>3085.49</nattax>\n" +
                    "        <natsum>26820</natsum>\n" +
                    "        <natdiscount>0</natdiscount>\n" +
                    "        <mid>1000000005</mid>\n" +
                    "        <discountrate>100</discountrate>\n" +
                    "        <discountrate2>100</discountrate2>\n" +
                    "        <taxrate>13</taxrate>\n" +
                    "        <irowno>1</irowno>\n" +
                    "        <dpredate>2019-07-25 00:00:00</dpredate>\n" +
                    "        <dpremodate>2019-07-25 00:00:00</dpremodate>\n" +
                    "        <bsaleprice>1</bsaleprice>\n" +
                    "        <bgift>0</bgift>\n" +
                    "      </entry>\n" +
                    "    </body>\n" +
                    "  </saleorder>\n" +
                    "</ufinterface>"
                    ;
            URL url = new URL(Global.getu8UR());
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setConnectTimeout(3000000);
            con.setReadTimeout(3000000);
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setAllowUserInteraction(false);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            con.setRequestProperty("ContentType","text/xml;charset=utf-8");
            //发送Request消息
            OutputStream out = con.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            System.out.println(requestXml);
            System.out.println(requestXml.getBytes("UTF-8"));
            System.out.println("222"+requestXml);
            dos.write(requestXml.getBytes("UTF-8")); //通过文件流读取数据
            dos.close();
            //获取Response消息
            InputStream in = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            StringBuilder sb = new StringBuilder();

            String s = null;
            while ((s = br.readLine()) != null)
            {
                sb.append(s);
            }
            String res_xml = sb.toString();
            br.close();
            System.out.println("----------" + res_xml);
            // 解析返回的xml
            String feedbackCode = "";
            Document document = DocumentHelper.parseText(res_xml);
            Element rootElm = document.getRootElement();
            Element u8apireturn = rootElm.element("u8apireturn");
            feedbackCode = u8apireturn.attribute("issuccess").getValue().trim().toString();//
            System.out.println("----------" + feedbackCode);
            String message="";
            String logStatus = "";
            if ("true".equals(feedbackCode)) {
                logStatus = "1";
                message="SUCCESS";
            } else {
                logStatus = "0";
                message = u8apireturn.element("error").getText().trim();
            }

            if (message.length() > 3000) {
                message = message.substring(0, 3000);
            }
            sysQrtLog.setLogStatus(logStatus);
            sysQrtLog.setDescription(message);
            sysQrtLog.setCreateDate(new Date());
        } catch (Exception e) {
            sysQrtLog.setLogStatus("0");
            String ms = e.toString();
            if (ms.length() > 3000) {
                ms = ms.substring(0, 3000);
            }
            sysQrtLog.setDescription(ms);
            sysQrtLog.setCreateDate(new Date());
        } finally {
            return sysQrtLog;
        }

    }

    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE01)
    public String SalesOrderReturn(Map<String, Object> soHeader, List<Map<String, Object>> soItemList) {

        String  messageage = null ; //返回消息
        // 解析销售退货单的基本信息
        String deliveryNo = (String) soHeader.get("deliveryNo");
        String currencyName = (String) soHeader.get("currency_name");
        String currencyRate = (String) soHeader.get("currency_rate");
        String taxRate = (String) soHeader.get("taxrate");
        String remark = (String) soHeader.get("remark");
        // 构建XML数据
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>\n");
        xmlBuilder.append("<ufinterface sender=\"002\" receiver=\"u8\" roottag=\"consignment\" proc=\"add\">\n");
        xmlBuilder.append("  <consignment>\n");
        xmlBuilder.append("    <header>\n");
        xmlBuilder.append("       <vouchertype>05</vouchertype>\n"); // 来源单据类型
        xmlBuilder.append("      <saletype>20</saletype>\n"); //销售类型
        xmlBuilder.append("      <date>").append(LocalDate.now()).append("</date>\n"); //单据日期
        xmlBuilder.append("      <deptcode>").append("203").append("</deptcode>\n"); //部门代码
        xmlBuilder.append("      <custcode>").append("25001011").append("</custcode>\n"); //客户代码
        xmlBuilder.append("      <address>").append("").append("</address>\n");  //客户地址
        xmlBuilder.append("      <currency_name>").append(currencyName).append("</currency_name>\n");
        xmlBuilder.append("      <currency_rate>").append(currencyRate).append("</currency_rate>\n");
        xmlBuilder.append("      <taxrate>").append(taxRate).append("</taxrate>\n");
        xmlBuilder.append("      <beginflag>0</beginflag>\n");
        xmlBuilder.append("      <returnflag>1</returnflag>\n");
        xmlBuilder.append("      <remark>").append(remark).append("</remark>\n");
        xmlBuilder.append("      <maker>").append("管理员").append("</maker>\n"); //制单人
        xmlBuilder.append("      <retail_custname>江苏吉麦新能源车业有限公司</retail_custname>\n"); //客户名称
        xmlBuilder.append("      <operation_type>普通销售</operation_type>\n"); //业务类型
        xmlBuilder.append("      <cverifier>").append("管理员").append("</cverifier>\n"); //审核人
        xmlBuilder.append("    </header>\n");
        xmlBuilder.append("    <body>\n");
        for (Map<String, Object> soItem : soItemList) {
            xmlBuilder.append("      <entry>\n");
            xmlBuilder.append("        <irowno>").append(soItem.get("irowno")).append("</irowno>\n");
            xmlBuilder.append("        <warehouse_code>XS02</warehouse_code>\n");
            xmlBuilder.append("        <inventory_code>").append(soItem.get("inventory_code")).append("</inventory_code>\n");
            xmlBuilder.append("        <quantity>").append(soItem.get("quantity")).append("</quantity>\n");
            xmlBuilder.append("        <taxprice>").append(soItem.get("taxprice")).append("</taxprice>\n");
            xmlBuilder.append("        <sum>").append(soItem.get("sum")).append("</sum>\n");
            xmlBuilder.append("        <natmoney>").append(soItem.get("natmoney")).append("</natmoney>\n");
            xmlBuilder.append("        <natsum>").append(soItem.get("sum")).append("</natsum>\n");
            xmlBuilder.append("      </entry>\n");
        }
        xmlBuilder.append("    </body>\n");
        xmlBuilder.append("  </consignment>\n");
        xmlBuilder.append("</ufinterface>");
        String xmlData = xmlBuilder.toString();
        // 暂时直接返回XML数据，实际中应根据具体情况进行调整
        Map<String, String> response = HttpXmlRequestUtil.sendXmlEai(xmlData);  //查看返回值
        if (response.get("message").equals("SUCCESS")) {  //如果返回值为成功处理vinlist
            /**
             *  010. 退货单主表和关联销售订单 - 废除
             *  011. 关联对方退货单单号
             *  020. 子表关联销售订单和行号 - 废除
             *  030. 销售订单修改退货数量、累计发货数量- 废除
             *  040. 修改存货数量 - 废除
             *  050. 处理vincode的信息
             */
//            DispatchList dispatchList = dispatchListMapper.selectByCdlcode(deliveryNo); //送货单
            DispatchList returnOrder = dispatchListMapper.selectByCdlcode(response.get("cDLCode")); //退货单
//            if (dispatchList != null){
//                //01. 主表和关联销售订单
//                if (dispatchListMapper.updateCsocodeByDlid(dispatchList.getCsocode(), returnOrder.getDlid()) == 1) {
//                 011. 关联对方退货单单号
            if (dispatchListMapper.updatecdefine18(returnOrder.getDlid(),deliveryNo)>=1) {
                    //02 子表关联销售订单和行id号
                    for (Map<String, Object> soItem : soItemList) {
//                        Dispatchlists dispatchlists = dispatchlistsMapper.selectByDlidAndCinvcode(dispatchList.getDlid(), soItem.get("inventory_code").toString());  //发货单明细
//                        Dispatchlists returnOrderDetails = dispatchlistsMapper.selectByDlidAndCinvcode(returnOrder.getDlid(), soItem.get("inventory_code").toString());  //退货明细
//                        returnOrderDetails.setIsosid(dispatchlists.getIsosid());
//                        returnOrderDetails.setCsocode(dispatchlists.getCsocode());
//                        if (dispatchlistsMapper.updateByPrimaryKey(returnOrderDetails) == 1) {
//                            //03. 销售订单修改退货数量、累计发货数量
//                            SOSODetails sosoDetails = sosoDetailsMapper.selectByCsocodeAndCinvcode(dispatchlists.getCsocode(), soItem.get("inventory_code").toString());
//                            if (sosoDetailsMapper.updateFretquantityAndIfhquantityByAutoid(sosoDetails.getFretquantity().add(returnOrderDetails.
//                                    getIquantity().abs()),sosoDetails.getIfhquantity().add(returnOrderDetails.getIquantity()),sosoDetails.getAutoid()) ==1) {
//                                //04. 修改存货数量
//                                CurrentStock inventoryCode = currentStockMapper.selectOneByCinvcodeAndCwhcode(soItem.get("inventory_code").toString(),"XS02");
//                                if (currentStockMapper.updateIquantityByAutoid(inventoryCode.getIquantity().add(returnOrderDetails.getIquantity().abs()),inventoryCode.getAutoid()) == 1) {
                                    //05. 处理vincode的信息
                                    List<Map<String, Object>> vinList = (List<Map<String, Object>>) soItem.get("vinList");
                                    for (Map<String, Object> vinItem : vinList) {
                                        String vin = vinItem.get("vin").toString(); //vin码
                                        StSnstate stSnstate = stSnstateMapper.selectOneByCinvsn(vin);
                                        if (stSnstate != null) {
                                            stSnstate.setIsnoperatecount(1);
                                            Integer stSnstateUpStatus = stSnstateMapper.updateByPrimaryKey(stSnstate);
                                            if (stSnstateUpStatus == 1 || stSnstateUpStatus ==0) {
                                                messageage = "SUCCESS";

                                            }else{
                                                messageage = "处理vincode的信息失败";
                                            }
                                        }else
                                        {
                                            messageage = "查询不到"+vin+"的纪录";
                                        }
                                    }
//                                }else{
//                                    messageage = "修改存货数量失败";
//                                }
//                            }else{
//                                messageage = "销售订单修改退货数量失败";
//                            }
//                        }else{
//                            messageage = "子表关联销售订单和行id号绑定失败";
//                        }
//                    }
//                } else {
//                    messageage = "主表和关联销售订单绑定失败";
//                }
//            }else {
//                messageage = "查询不到销售或销售订单";
            }
            }
        }else{
            messageage = response.get("message");
        }
        return messageage;
    }
}
