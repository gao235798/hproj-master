package com.espread.sys.job;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import com.espread.common.constant.Global;


public class CreateClient {
    private static Client client;
    private static HttpURLConnection conn;
    private static String url = Global.getWebServiceUR();

    //private static String  urlu8=Global.getu8UR();
    private static JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();


    public static Client getClient() {
        if (client == null) {
            client = factory.createClient(url);
        }
        return client;
    }

    public static HttpURLConnection getConn() {
        if (conn == null) {
            try {
                conn = (HttpURLConnection) (new URL(Global.getu8UR())).openConnection();
                conn.setConnectTimeout(3000000);
                conn.setReadTimeout(3000000);
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setAllowUserInteraction(false);
                conn.setUseCaches(false);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

}
