package com.espread.sys.service.impl;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.constant.Global;
import com.espread.common.web.service.BaseServiceImpl;
import com.espread.sys.job.CreateClient;
import com.espread.sys.mapper.InventoryMapper;
import com.espread.sys.model.Inventory;
import com.espread.sys.service.EhrToLesService;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.impl.InventoryServiceImpl;
@Service
public class EhrToLesServiceImpl  implements EhrToLesService {

	private static Logger LOGGER = LoggerFactory.getLogger(EhrToLesServiceImpl.class);

	// public String url="http://127.0.0.1:8080/espread/ws/webService?wsdl";
	// JaxWsDynamicClientFactory factory =
	// JaxWsDynamicClientFactory.newInstance();
	
	public String resultxml = "";
	public long ConnectionTimeout = 30000;
	public long ReceiveTimeout = 50000;
	Client client;
	HTTPConduit conduit;
	HTTPClientPolicy policy = new HTTPClientPolicy();
	Object[] result;
	long startTime = 0;
	long endTime = 0;
    @Override
	public String toInventory(String str_xml,String ttype) {
		System.out.println("开始:");
		try {

				client = CreateClient.getClient();
				//System.out.println("开始1:");
				conduit = (HTTPConduit) client.getConduit();
				//System.out.println("开始2:");
			    if(ttype=="WorkPlanInterface")
			    {
			    	ReceiveTimeout=90000;
			    }
			    else
			    {
			    	ReceiveTimeout=50000;
			    }
				policy.setConnectionTimeout(ConnectionTimeout);
				policy.setReceiveTimeout(ReceiveTimeout);
				
				//System.out.println("开始3:");
				conduit.setClient(policy);
				
				//System.out.println("开始4:");
				startTime = System.currentTimeMillis(); // 获取开始时间
				System.out.println("startTime:" + startTime);
				// 动态invoke方法
				result = client.invoke(ttype, str_xml);
				
				resultxml = result[0].toString();
				//resultxml = "<?xml version=\"1.0\" encoding=\"gb2312\"?><ReturnModel><feedbackCode>SUCCESS</feedbackCode></ReturnModel>";
				 System.out.println("fenhui"+resultxml);
	
				endTime = System.currentTimeMillis(); // 获取结束时间
				System.out.println("endTime:" + endTime);
				System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
		   }
		catch (Exception e) {
			LOGGER.error("webservice发送异常{}", e);
			String ms = e.toString();
			if (ms.length() > 3000) 
			{
				ms = ms.substring(0, 3000);
			}

			resultxml = "<?xml version=\"1.0\" encoding=\"gb2312\"?><ReturnModel><feedbackCode>网络连接异或者LES服务器处理异常："+ms+"</feedbackCode></ReturnModel>";
			System.out.println("网络连接异常");
		} 
		finally
		{
			return resultxml;
		}

	}
    
    
    @Override
   	public String toDms(String xmlStr,String type) {
    	
		URL urlObj =null;
		HttpURLConnection conn=null;
		String retStr="";
		DataOutputStream dos=null;
		BufferedReader reader=null;
		try {
			String DMSurl=Global.getDMSurl();
			urlObj = new URL(DMSurl+type);
			conn = (HttpURLConnection) urlObj.openConnection();
			conn.setRequestProperty("Content-Type", "application/xml");
			conn.setRequestProperty("Accept", "application/xml");
			conn.setRequestMethod("POST");
			conn.setUseCaches(false);
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setConnectTimeout(30000);
			conn.setReadTimeout(90000);
			dos = new DataOutputStream(conn.getOutputStream());
			dos.write(xmlStr.getBytes("utf-8"));
			dos.flush();
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String line = null;
			StringBuffer strBuf = new StringBuffer();
			while ((line = reader.readLine()) != null) {
			    strBuf.append(line);
			}
			retStr = strBuf.toString();
		} catch (Exception e) {
			//log.error("使用HttpURLConnection POST传输XML数据异常==="+e);
			LOGGER.error("dms发送异常{}", e);
			System.out.println("网络连接异常："+e.toString());
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			retStr = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
			+"<ResultMessageDTO>"
			+"<RESULT_FLAG>10011002</RESULT_FLAG>"
			  +"<ERR_MESSAGE>网络连接异或者DMS服务器处理异常："+ms+"</ERR_MESSAGE>"
			  +"<GUID>1000000001</GUID>"
			  +"</ResultMessageDTO>";
			System.out.println("网络连接异常");
			// System.out.println(resultxml);
		}finally {
			try {
				if(dos!=null) dos.close();
				
				if(reader!=null) reader.close();
				 if(conn!=null) conn.disconnect();

			} catch (Exception e2) { }
			return retStr;
		}
		
	}


   	}
