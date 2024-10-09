package com.espread.sys.controller;

import com.espread.common.utils.HttpUtilTool;
import com.espread.sys.service.SysServicesServer;
import com.espread.sys.service.VinCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/static/sysService")
public class SysServicesController {

    @Autowired
   private  SysServicesServer server;

    @Autowired
    private VinCodeService vinCodeService;

    /**
     *  1. 吉麦采购订单写入生产ERP生成销售订单
     *      *  2. 根据信息写入数据库Vin码
     */
    @RequestMapping(value = "saleOrders" ,method =  RequestMethod.POST)
    @ResponseBody
    public Object setSaleOrders(@RequestBody Map<String, Object> requestData){

//        Map<String, Object> soHeader = (Map<String, Object>) requestData.get("soHeader");
//        List<Map<String, Object>> soItemList = (List<Map<String, Object>>) requestData.get("soItemList");
//        //写入销售订单
//        return server.toSaleOrder(soHeader,soItemList);
        return  "helloWord" ;
    }

    /**
     *  1. 销售退货单接口
     * @param salesOrders
     * @return
     */
    @RequestMapping(value = "/SalesOrderReturn", method = RequestMethod.POST)
    @ResponseBody
    public Object SalesOrderReturn( @RequestBody Map<String, Object> salesOrders){

            Map<String, Object> soHeader = new HashMap<>();
            soHeader.put("deliveryNo",salesOrders.get("deliveryNo"));
            soHeader.put("currency_name",salesOrders.get("currency_name"));
            soHeader.put("currency_rate",salesOrders.get("currency_rate"));
            soHeader.put("taxrate",salesOrders.get("taxrate"));
            soHeader.put("remark",salesOrders.get("remark"));
            List<Map<String, Object>> soItemList = (List<Map<String, Object>>) salesOrders.get("detailList");
            String returnMessage =server.SalesOrderReturn(soHeader,soItemList);
            if (!returnMessage.equals("SUCCESS"))
            {
                String  message = returnMessage;
                return HttpUtilTool.createHttpResult(false,201,message) ;
            }
                return HttpUtilTool.createHttpResult(true,200,"success") ;
    }
}
