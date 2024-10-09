package com.espread.sys.webservice.impl;

  
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.sys.mapper.Base1Mapper;
import com.espread.sys.mapper.POPodetailsMapper;
import com.espread.sys.service.LesToErpService;
import com.espread.sys.service.SysLogService;
import com.espread.sys.webservice.WebServiceServer;  
  


@WebService(
        endpointInterface = "com.espread.sys.webservice.WebServiceServer", 
        serviceName="WebServiceServer", 
        targetNamespace="http://webservice.sys.espread.com/")
@Service("serviceServer")

public class WebServiceServerImpl implements WebServiceServer {

	 @Autowired
	 private Base1Mapper baseMapper;
	  @Autowired
	    private LesToErpService lesToErpService;
	
	
	public String SayHello(String param) {
		 Map<String, Object> parms = new HashMap<String, Object>();  
         parms.put("zt", "006");  
         parms.put("lx", "rd");
         parms.put("sl", 2);
         lesToErpService.getUserById(parms);
         
        System.out.println("ifatherid:"+ parms.get("ifatherid").toString()+" ichildid:"+ parms.get("ichildid").toString());
       
		
		//baseMapper.insert("insert into Test_Table(name) values(@@spid)");
		return "<?xml version=\"1.0\" encoding=\"gb2312\"?><ReturnModel><feedbackCode>SUCCESS</feedbackCode></ReturnModel>";
	}

}
