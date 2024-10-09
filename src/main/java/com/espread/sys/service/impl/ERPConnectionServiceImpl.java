package com.espread.sys.service.impl;

import com.alibaba.druid.sql.visitor.functions.Concat;
import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.utils.DateUtils;
import com.espread.common.utils.HttpXmlRequestUtil;
import com.espread.sys.mapper.*;
import com.espread.sys.model.*;
import com.espread.sys.service.ERPConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author lingzheng
 * @version 1.0
 * @description
 * @date 2024-09-24
 */
@Service
public class ERPConnectionServiceImpl implements ERPConnectionService {

    @Autowired(required = false)
    POPodetailsMapper POPodetailsMapper;
    @Autowired(required = false)
    SOSOMainMapper sosoMainMapper;
    @Autowired(required = false)
    DispatchlistsMapper dispatchlistsMapper;
    @Autowired(required = false)
    POPomainMapper poPomainMapper;
    @Autowired(required = false)
    DispatchListMapper dispatchListMapper;

    @Override
    public SysQrtzLog salesOrderSync(POPomain poPomain) {  // 销售订单同步
        String xmls = salesOrderXml(poPomain);
        // 暂时直接返回XML数据，实际中应根据具体情况进行调整
        Map<String, String> response = HttpXmlRequestUtil.sendXmlEai(xmls);  //查看返回值
         poPomainMapper.updatePOPomainxs(poPomain.getPoid(), response.get("message"), response.get("logStatus"));
        SysQrtzLog sysQrtzLog = new SysQrtzLog();
        sysQrtzLog.setLogMessage(response.get("message") + "销售单号为" + response.get("cDlCode"));
        sysQrtzLog.setLogStatus(response.get("logStatus"));
        sysQrtzLog.setCreateDate(new Date());
        return sysQrtzLog;
    }


    @Override
    public SysQrtzLog salesOrderDeliverySync(DispatchList dispatchList) { //销售订单交货单同步
        String xmls = saleOrderDeliverXml(dispatchList);
        // 暂时直接返回XML数据，实际中应根据具体情况进行调整
        Map<String, String> response = HttpXmlRequestUtil.sendXmlEai(xmls);  //查看返回值
        dispatchListMapper.updatecdefine17(dispatchList.getDlid(),response.get("message"));
        SysQrtzLog sysQrtzLog = new SysQrtzLog();
        sysQrtzLog.setLogMessage(response.get("message") + "收货单号为" + response.get("cDlCode"));
        sysQrtzLog.setLogStatus(response.get("logStatus"));
        sysQrtzLog.setCreateDate(new Date());
        return sysQrtzLog;
    }

    @DataSourceChange(Const.DATASOURCE_SLAVE01)
    protected String saleOrderDeliverXml(DispatchList dispatchList) {
        SOSOMain sosoMain = sosoMainMapper.selectByCsocode(dispatchList.getCsocode());
        if (sosoMain.getCdefine10() != null) {
            StringBuilder xmlBuilder = new StringBuilder();
            xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            xmlBuilder.append("<ufinterface proc=\"add\" receiver=\"u8\" roottag=\"storein\" sender=\"003\">");
            xmlBuilder.append("    <storein>");
            // 拼接 header 部分
            xmlBuilder.append("        <header>");
            xmlBuilder.append("            <define10>" + dispatchList.getCsocode() + "</define10>");   //销售订单号
            xmlBuilder.append("            <define11>" + sosoMain.getCsocode() + "</define11>"); //采购订单号
            xmlBuilder.append("            <date>" + DateUtils.getDate() + "</date>");
            xmlBuilder.append("            <businesstype>普通采购</businesstype>");
            xmlBuilder.append("            <source>采购订单</source>");
            xmlBuilder.append("            <vendorcode>001</vendorcode>");
            xmlBuilder.append("            <vouchtype>01</vouchtype>");
            xmlBuilder.append("            <warehousecode>XS01</warehousecode>");
            xmlBuilder.append("            <purchasetypecode>01</purchasetypecode>");
            xmlBuilder.append("            <taxrate>13</taxrate>");
            xmlBuilder.append("            <receivecode>101</receivecode>");
            xmlBuilder.append("            <maker>demo</maker>");
            xmlBuilder.append("            <exchname>人民币</exchname>");
            xmlBuilder.append("            <exchrate>1</exchrate>");
            xmlBuilder.append("        </header>");
            // 拼接 body 部分
            xmlBuilder.append("        <body>");
            List<Dispatchlists> dis = dispatchlistsMapper.selectByDlid(dispatchList.getDlid());
            for (Dispatchlists dispatchlists : dis) {
                xmlBuilder.append("            <entry>");
                xmlBuilder.append("                <inventorycode>" + dispatchlists.getCinvcode() + "</inventorycode>");  //物料编码
                xmlBuilder.append("                <quantity>" + dispatchlists.getIquantity() + "</quantity>"); //数量
                xmlBuilder.append("                <taxprice>" + dispatchlists.getItax() + "</taxprice>"); //税
                xmlBuilder.append("                <isum>" + dispatchlists.getIsum() + "</isum>"); //总数
                xmlBuilder.append("                <iorderseq>" + dispatchlists.getIdemandtype() + "</iorderseq>");  //销售订单行号
                xmlBuilder.append("                <define24>" + salesOrderNo(dispatchList.getCsocode(), dispatchlists.getCinvcode()) + " </define24>"); //采购订单行号
                xmlBuilder.append("                <ioritaxcost>" + dispatchlists.getItaxunitprice() + "</ioritaxcost>");
                xmlBuilder.append("                <ioricost>" + dispatchlists.getIunitprice() + "</ioricost>");
                xmlBuilder.append("                <ioritaxprice>" + dispatchlists.getItax() + "</ioritaxprice>");
                xmlBuilder.append("                <iorisum>" + dispatchlists.getIsum() + "</iorisum>");
                xmlBuilder.append("                <iorimoney>" + dispatchlists.getImoney() + "</iorimoney>");
                xmlBuilder.append("                <taxrate>13</taxrate>");
                xmlBuilder.append("            </entry>");
            }
            xmlBuilder.append("        </body>");
            xmlBuilder.append("    </storein>");
            xmlBuilder.append("</ufinterface>");
            return xmlBuilder.toString();
        } else {
            return null;
        }

    }

    @DataSourceChange(Const.DATASOURCE_SLAVE)
    protected String salesOrderXml(POPomain poPomain)  //拼接xml
    {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>\n");
        xmlBuilder.append("<ufinterface sender=\"002\" receiver=\"u8\" roottag=\"saleorder\" proc=\"add\">\n");
        xmlBuilder.append("  <saleorder>\n");
        xmlBuilder.append("    <header>\n");
        xmlBuilder.append("       <custcode>").append("1006").append("</custcode>\n"); // 客户代码
        xmlBuilder.append("      <cusname>").append("江苏淮海汽车销售有限公司").append("</cusname>\n"); //客户名称
        xmlBuilder.append("      <define10>").append(poPomain.getCappcode()).append("</cusname>"); //003采购订单号
        xmlBuilder.append("      <maker>").append("管理员").append("</maker>\n"); //制单人
        xmlBuilder.append("      <date>").append(LocalDate.now()).append("</date>\n"); //单据日期
        xmlBuilder.append("      <typecode>").append("11").append("</typecode>\n"); //销售类型
        xmlBuilder.append("      <taxrate>").append("13").append("</taxrate>\n"); //税率
        xmlBuilder.append("      <businesstype>").append("普通销售").append("</businesstype>\n");  //销售类型
        xmlBuilder.append("      <dpredatebt>").append("普通销售").append("</dpredatebt>\n");  //预计发货日期
        xmlBuilder.append("    </header>\n");
        xmlBuilder.append("    <body>\n");
        List<POPodetails> poPodetails = POPodetailsMapper.selectByALLPOPodetails(poPomain.getPoid());
        for (POPodetails podetails : poPodetails) {
            xmlBuilder.append("<entry>");
            xmlBuilder.append("      <inventorycode>").append(podetails.getCinvcode()).append("</inventorycode>\n"); //存货编码
            xmlBuilder.append("      <quantity>").append(podetails.getIquantity()).append("</quantity>\n"); //数量
            xmlBuilder.append("      <tax>").append(podetails.getItax()).append("</tax>\n"); //原币税额
            xmlBuilder.append("      <sum>").append(podetails.getIsum()).append("</sum>\n"); //原币税额合计
            xmlBuilder.append("      <dpredate>").append(podetails.getDarrivedate()).append("</dpredate>\n"); //预计发货日期
            xmlBuilder.append("      <dpremodate>").append(podetails.getDarrivedate()).append("</dpremodate>\n"); //预计完工日期
            xmlBuilder.append("      <num>").append("0").append("</num>\n"); //辅助计量数量
            xmlBuilder.append("      <quotedprice>").append(podetails.getIsum()).append("</quotedprice>\n"); //报价 = 原币税额合计
            xmlBuilder.append("      <unitprice>").append(podetails.getIunitprice()).append("</unitprice>\n"); //原币无税单价
            xmlBuilder.append("      <taxunitprice>").append(podetails.getIquotedprice()).append("</taxunitprice>\n"); //原币含税单价
            xmlBuilder.append("      <money>").append(podetails.getImoney()).append("</money>\n"); //原币无税金额
            xmlBuilder.append("      <discount>").append(podetails.getIdiscount()).append("</discount>\n"); //原币折扣价
            xmlBuilder.append("      <natunitprice>").append(podetails.getInatunitprice()).append("</natunitprice>\n"); //本币无税价
            xmlBuilder.append("      <natmoney>").append(podetails.getInatmoney()).append("</natmoney>\n"); //本币无税金额
            xmlBuilder.append("      <nattax>").append(podetails.getInattax()).append("</nattax>\n"); //本币税额
            xmlBuilder.append("      <natsum>").append(podetails.getInatsum()).append("</natsum>\n"); //本币价税合计
            xmlBuilder.append("      <natdiscount>").append("0").append("</natdiscount>\n"); //本币折扣额
            xmlBuilder.append("      <taxrate>").append("13").append("</taxrate>\n"); //税率
            xmlBuilder.append("      <bsaleprice>").append("1").append("</bsaleprice>\n"); //报价含税表示
            xmlBuilder.append("      <bgift>").append("0").append("</bgift>\n"); //赠品表示
            xmlBuilder.append("</entry>");
        }
        xmlBuilder.append("    </body>\n");
        xmlBuilder.append("  </saleorder>\n");
        xmlBuilder.append("</ufinterface>");
        return xmlBuilder.toString();
    }

    /**
     * @return 采购订单行号
     */
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    private int salesOrderNo(String csocode, String cinvcode) {
        return POPodetailsMapper.selectOneByCsocodeAndCinvcode(csocode, cinvcode).getIrowno();
    }


}
