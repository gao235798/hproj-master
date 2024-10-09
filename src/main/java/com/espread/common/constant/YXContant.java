package com.espread.common.constant;

import java.util.Map;

import com.espread.common.utils.PropertiesLoader;
import com.google.common.collect.Maps;

public class YXContant {
    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();

    /**
     * 属性文件加载对象
     */
    private static PropertiesLoader propertiesLoader = new PropertiesLoader("yxjdbc.properties");

    /**
     * 获取配置
     */
    public static String getConfig(String key) {
        String value = map.get(key);
        if (value == null) {
            value = propertiesLoader.getProperty(key);
            map.put(key, value);
        }
        return value;
    }

    /**
     * 获取管理端根路径
     */
    public static String getU8URL() {
        return getConfig("U8URL");
    }

    /**
     * 获取管理端根路径
     */
    public static String getYX_driverUrl() {
        return getConfig("YX_driverUrl");
    }

    /**
     * 获取管理端根路径
     */
    public static String getYX_username() {
        return getConfig("YX_username");
    }

    /**
     * 获取管理端根路径
     */
    public static String getYX_password() {
        return getConfig("YX_password");
    }

    /**
     * 获取管理端根路径
     */
    public static String getYXIP() {
        return getConfig("YXIP");
    }

    /**
     * 获取管理端根路径
     */
    public static String getGCZT() {
        return getConfig("GCZT");
    }

    /**
     * 获取管理端根路径
     */
    public static String getXML() {
        return getConfig("XML");
    }

    public static String getTime() {
        return getConfig("time");
    }

}
