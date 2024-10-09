package com.espread.sys.controller;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.utils.ResponseResult;
import com.espread.sys.service.SysServicesServer;
import com.espread.sys.service.VinCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/static/vinCode")
public class VinCodeController {

    @Autowired
    private VinCodeService vinCodeService;

    /**
     *  写入VIN码信息
     */
    @RequestMapping(value = "/AddProductionVincode" ,method = RequestMethod.POST)
    @DataSourceChange(Const.DATASOURCE_SLAVE01)
    @ResponseBody
    public ResponseResult AddProductionVincode(@RequestBody List<Map<String, Object>> dataList){
        for (Map<String, Object> vincode:dataList) {
           ResponseResult  returnMessage =  vinCodeService.addVinCode(vincode);
            if (returnMessage.getCode() == 500 || returnMessage.getCode() == 502) {
                return returnMessage;
            }
        }
        return ResponseResult.okResult();
    }
    @RequestMapping(value = "/AddMarketingVincode" ,method = RequestMethod.POST)
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    @ResponseBody
    public ResponseResult AddMarketingVincode(@RequestBody List<Map<String, Object>> dataList){
        for (Map<String, Object> vincode:dataList) {
            ResponseResult  returnMessage =  vinCodeService.addVinCode(vincode);
            if (returnMessage.getCode() == 500 || returnMessage.getCode() == 502) {
                return returnMessage;
            }
        }
        return ResponseResult.okResult();
    }
}
