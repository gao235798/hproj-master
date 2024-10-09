package com.espread.common.utils;
import com.espread.common.constant.Global;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HttpXmlRequestUtil {
    public static Map<String, String> sendXmlEai(String requestXml) {
        Map<String, String> sysQrtLog = new HashMap<>();
        try {
            // 设置连接属性
            URL url = new URL(Global.getu8UR_10());
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(3000000);
            con.setReadTimeout(3000000);
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setAllowUserInteraction(false);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            con.setRequestProperty("ContentType", "text/xml;charset=utf-8");

            // 发送Request消息
            OutputStream out = con.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.write(requestXml.getBytes("UTF-8"));
            dos.close();

            // 获取Response消息
            InputStream in = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            String res_xml = sb.toString();
            br.close();

            // 解析返回的xml

            Document document = DocumentHelper.parseText(res_xml);
            Element rootElm = document.getRootElement();
            Element item = rootElm.element("item");
            String feedbackCode = item.attributeValue("dsc");
            String message = "";
            String logStatus;
            if ("ok".equals(feedbackCode)) {
                logStatus = "1";
                message = "SUCCESS";
            } else {
                logStatus = "0";
                message = feedbackCode;
            }
            if (message.length() > 3000) {
                message = message.substring(0, 3000);
            }
            sysQrtLog.put("logStatus",logStatus);
            sysQrtLog.put("message",message);
            sysQrtLog.put("date",new Date().toString());
            sysQrtLog.put("cDLCode",item.attributeValue("key"));
        } catch (Exception e) {
            sysQrtLog.put("logStatus","0");
            String ms = e.toString();
            if (ms.length() > 3000) {
                ms = ms.substring(0, 3000);
            }
            sysQrtLog.put("setDescription",ms);
            sysQrtLog.put("date",new Date().toString());
        }
        return sysQrtLog;
    }
}
