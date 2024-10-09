package com.espread.common.constant;

import java.util.Map;

import com.espread.common.utils.PropertiesLoader;
import com.google.common.collect.Maps;

/**
 * 全局配置类
 */
public class Global {

	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = Maps.newHashMap();

	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader propertiesLoader = new PropertiesLoader("application.properties");

	/**
	 * 获取配置
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = propertiesLoader.getProperty(key);
			map.put(key, value);
		}
		return value;
	}

	/**
	 * 获取管理端根路径
	 */
	public static String getAdminPath() {
		return getConfig("adminPath");
	}

	/**
	 * 获取前端根路径
	 */
	public static String getFrontPath() {
		return getConfig("frontPath");
	}

	/**
	 * 获取URL后缀
	 */
	public static String getUrlSuffix() {
		return getConfig("urlSuffix");
	}



	/**
	 * 获取webserviceURL后缀
	 */
	public static String getWebServiceUR() {
		return getConfig("webService");
	}
	/**
	 * 获取u8URL后缀
	 */
	public static String getu8UR() {
		return getConfig("u8url");
	}
	public static String getu8UR_10() {
		return getConfig("u8url_10");
	}
	public static String getSender() {
		return getConfig("sender");
	}

	public static String getSenderDMS() {
		return getConfig("senderDMS");
	}


	public static String getDMSurl() {
		return getConfig("DMSurl");
	}

	public static String getJmSapurl() {
		return getConfig("JmSapurl");
	}

}
