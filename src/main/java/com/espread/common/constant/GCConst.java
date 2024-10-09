package com.espread.common.constant;

import java.util.Map;

import com.espread.common.utils.PropertiesLoader;
import com.google.common.collect.Maps;

public class GCConst
{

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();
    
    /**
     * 属性文件加载对象
     */
    private static PropertiesLoader propertiesLoader = new PropertiesLoader("jdbc.properties");
    
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
    public static String getSlaveUrl() {
        return getConfig("slave_driverUrl");
    }
    /**
     * 获取管理端根路径
     */
    public static String getSlaveName() {
        return getConfig("slave_username");
    }
    
    /**
     * 获取管理端根路径
     */
    public static String getSlavePwd() {
        return getConfig("slave_password");
    }
     public static String getSlaveUrl01() {
        return getConfig("slave01_driverUrl");
    }
    /**
     * 获取管理端根路径
     */
    public static String getSlaveName01() {
        return getConfig("slave01_username");
    }

    /**
     * 获取管理端根路径
     */
    public static String getSlavePwd01() {
        return getConfig("slave01_password");
    }

}
