package com.espread.sys.service.impl;


import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.utils.AppHttpCodeEnum;
import com.espread.common.utils.ResponseResult;
import com.espread.sys.mapper.SaSndetailDispMapper;
import com.espread.sys.mapper.StSnstateMapper;
import com.espread.sys.model.StSnstate;
import com.espread.sys.service.VinCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class VinCodeServiceImpl  implements VinCodeService {

    @Autowired
    private StSnstateMapper stSnstateMapper;

    @Override
    public ResponseResult addVinCode(Map<String, Object> vincode) {
        try {
            StSnstate stsnState = new StSnstate();
            stsnState.setCincode(vincode.get("cInCode").toString());
            stsnState.setCinvsn(vincode.get("cInvSN").toString());
            stsnState.setCinvcode(vincode.get("cInvCode").toString());
            stsnState.setCsndefine1(vincode.get("iRowNO").toString());
            stsnState.setCsndefine10(vincode.get("sapCode").toString());
            if (stSnstateMapper.selectOneByCinvsn(vincode.get("cInvSN").toString())== null){
                stSnstateMapper.insert(stsnState);
                return ResponseResult.okResult();
            }else{
                ResponseResult result = new ResponseResult<>();
                result.setCode(502);
                result.setMsg("VIN码重复 ： "+vincode.get("cInvSN").toString());
                return  result ;
            }
        } catch (Exception e) {
            return  ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR);
        }
    }

}
