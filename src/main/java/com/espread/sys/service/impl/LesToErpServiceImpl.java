package com.espread.sys.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.mapper.JsonMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.shiro.ShiroUser;
import com.espread.common.utils.IPUtil;
import com.espread.common.utils.PageHelperUtils;
import com.espread.common.web.PageInfo;
import com.espread.common.web.service.BaseServiceImpl;
import com.espread.sys.mapper.Base1Mapper;
import com.espread.sys.mapper.DepartmentMapper;
import com.espread.sys.mapper.InventoryMapper;
import com.espread.sys.mapper.MomOrderdetailMapper;
import com.espread.sys.mapper.POPomainMapper;
import com.espread.sys.mapper.Rdrecord10Mapper;
import com.espread.sys.mapper.SysLogMapper;
import com.espread.sys.mapper.TransVouchMapper;
import com.espread.sys.mapper.TransVouchsMapper;
import com.espread.sys.mapper.VendorMapper;
import com.espread.sys.mapper.WarehouseMapper;
import com.espread.sys.model.Inventory;
import com.espread.sys.model.SysLog;
import com.espread.sys.service.LesToErpService;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysLogService;

import eu.bitwalker.useragentutils.UserAgent;

@Service
public class LesToErpServiceImpl extends BaseServiceImpl<Inventory> implements LesToErpService {

    private static Logger LOGGER = LoggerFactory.getLogger(LesToErpServiceImpl.class);

    @Autowired
    private Base1Mapper base1Mapper;
    
   
    
    

    
    //物料
    @Override
    @DataSourceChange(Const.DATASOURCE_SLAVE)
    public void  getUserById(Map<String, Object> parm ) {
    	base1Mapper.getUserById(parm);
        
    }



}
