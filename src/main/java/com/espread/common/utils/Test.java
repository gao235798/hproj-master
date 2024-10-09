package com.espread.common.utils;

import lombok.SneakyThrows;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public  class  Test{
    public static void main(String[] args) {

        Map<String, Object> vinItem = new HashMap<>();
        vinItem.put("vin","LHAEAT424KA000001");

        String vin = (String) vinItem.get("vin"); //vin码
    }
}

