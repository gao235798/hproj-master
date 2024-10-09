package com.espread.common.utils;
import com.alibaba.fastjson.JSONObject;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 
 */
public class Testapi {

	private static String access_token ="", refresh_token="", expires_in="";
	private static String uriStatic = "https://iam.jpddc.com/";
	private static String clientId="messaging-client-ok";
	private static String clientSecret="secret";
	private static boolean GetTokenCredentials()  {
		System.out.println("凭证模式获取Token");
		String url = uriStatic+  "oauth2/token" ;
		Map<String, String> map = new HashMap<>();
		map.put("grant_type", "client_credentials");
		Map<String, String> headers = new HashMap<>();
		headers.put("Authorization","Basic " + Base64.getUrlEncoder().encodeToString((clientId + ":" + clientSecret).getBytes()));
		String respText = HttpUtilTool.PostFormData(url, map, headers,null);
		if(!StringUtils.isEmpty(respText)){
			JSONObject dic = JSONObject.parseObject(respText);
			if(dic.containsKey("access_token")){
				System.out.println("获取Token成功");
				access_token=dic.getString("access_token");//令牌
				System.out.println("令牌: "+access_token);
				expires_in=dic.getString("expires_in"); //过期时间
				System.out.println("令牌过期时间: "+expires_in);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		//凭证模式获取Token
		GetTokenCredentials();
	}

}



