package com.espread.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import org.apache.http.HttpHeaders;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCredentialsProvider;

import java.io.IOException;
import java.util.*;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 主要用于调用 http接口 https接口
 *
 */
public class HttpUtilTool {
    private static HttpUtilTool httpUtilTool;
    public static final String BOUNDARY = "---------------------------123821742118716";
    // 获取token信息
    private static String access_token ="", refresh_token="", expires_in="";
    private  static String uriStatic = "https://iam.jpddc.com/";
    private static String clientId="messaging-client-ok";
    private static String clientSecret="secret";

    public static HttpUtilTool getInstance() {
        if (null == httpUtilTool) {
            httpUtilTool = new HttpUtilTool();
        }
        return httpUtilTool;
    }
    //获取token
    public static String GetTokenCredentials()  {
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
            }
        }
        return access_token;
    }

    public String toHttpsGet(String url, Map<String, String> headers) {
        HttpGet httpGet = null;
        HttpResponse httpResponse = null;
        String result = null;
        try (CloseableHttpClient closeableHttpClient = this.createHttpClient()) {
            httpGet = new HttpGet(url);
            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpGet.setHeader(entry.getKey(), entry.getValue());
                }
            }
            httpResponse = closeableHttpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity, "UTF-8");
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // HttpEntity httpEntity = httpResponse.getEntity();
                //result = EntityUtils.toString(httpEntity, "UTF-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String toHttpsDelete(String url, Map<String, String> headers) {
        String encode = "UTF-8";
        HttpDelete httpDelete = null;
        HttpResponse httpResponse = null;
        String result = null;
        try (CloseableHttpClient closeableHttpClient = createHttpClient()) {
            httpDelete = new HttpDelete(url);
            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpDelete.setHeader(entry.getKey(), entry.getValue());
                }
            }
            httpResponse = closeableHttpClient.execute(httpDelete);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                result = EntityUtils.toString(httpEntity, encode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String toHttpsPut(String url, String json, Map<String, String> headers) {
        String result = "";
        String encode = "UTF-8";
        try (CloseableHttpClient closeableHttpClient = createHttpClient()) {
            HttpPut httpPut = new HttpPut(url);

            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPut.setHeader(entry.getKey(), entry.getValue());
                }
            }
            StringEntity stringEntity = new StringEntity(json, encode);
            stringEntity.setContentType("application/json");
            httpPut.setEntity(stringEntity);
            try (CloseableHttpResponse httpResponse = closeableHttpClient.execute(httpPut)) {
                int code = httpResponse.getStatusLine().getStatusCode();
                if (code == 500) {
                    System.out.println("error");
                }
                if (code == HttpStatus.SC_OK) {
                    result = EntityUtils.toString(httpResponse.getEntity(), encode);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String toHttpsPost(String url, String json, Map<String, String> headers,String token) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        String encode = "UTF-8";
        String result = null;
        try (CloseableHttpClient closeableHttpClient = createHttpClient();) {
            HttpPost httpPost = new HttpPost(url);

            // Set Bearer token if provided
            if (token != null && !token.isEmpty()) {
                httpPost.setHeader("" +
                        "" +
                        "", "Bearer " + token);
            }

            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPost.setHeader(entry.getKey(), entry.getValue());
                }
            }

            StringEntity stringEntity = new StringEntity(json, "UTF-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            try (CloseableHttpResponse httpResponse = closeableHttpClient.execute(httpPost)) {
                int code = httpResponse.getStatusLine().getStatusCode();
                if (code == HttpStatus.SC_OK) {
                    result = EntityUtils.toString(httpResponse.getEntity(), encode);
                }
            }
        }
        return result;
    }

    //避免需要证书
    private static CloseableHttpClient createHttpClient() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, (chain, authtyep) -> true).build();
        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext, null, null, new NoopHostnameVerifier());
        return HttpClients.custom().setSSLSocketFactory(socketFactory).build();
    }

    public JSONObject toDelete(String url, Map<String, String> headers) {
        String encode = "UTF-8";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpDelete httpDelete = null;
        HttpResponse httpResponse = null;
        JSONObject jsonObject = null;
        try {
            httpDelete = new HttpDelete(url);
            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpDelete.setHeader(entry.getKey(), entry.getValue());
                }
            }
            httpResponse = httpClient.execute(httpDelete);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(httpEntity, encode);
                jsonObject = JSONObject.parseObject(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

    public JSONObject toPut(String url, String jsonStr, Map<String, String> headers) throws IOException {
        String encode = "UTF-8";
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpPut httpPut = null;
            HttpResponse httpResponse = null;
            JSONObject jsonObject = null;
            try {
                httpPut = new HttpPut(url);
                httpPut.setHeader("Content-type", "application/json");
                if (null != headers && headers.size() > 0) {
                    for (Map.Entry<String, String> entry : headers.entrySet()) {
                        httpPut.setHeader(entry.getKey(), entry.getValue());
                    }
                }
                StringEntity stringEntity = new StringEntity(jsonStr, encode);
                httpPut.setEntity(stringEntity);
                httpResponse = httpClient.execute(httpPut);
                if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    HttpEntity httpEntity = httpResponse.getEntity();
                    String result = EntityUtils.toString(httpEntity, encode);
                    jsonObject = JSONObject.parseObject(result);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return jsonObject;
        }
    }


    public JSONObject toPost(String url, Map<String, String> map, Map<String, String> headers, String encode) {
        if (null == encode) {
            encode = "UTF-8";
        }
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = null;
        HttpResponse httpResponse = null;
        JSONObject jsonObject = null;
        try {
            httpPost = new HttpPost(url);
            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPost.setHeader(entry.getKey(), entry.getValue());
                }
            }

            if (null != map) {
                List<NameValuePair> pairList = new ArrayList<>();
                for (String key : map.keySet()) {
                    pairList.add(new BasicNameValuePair(key, (String) map.get(key)));
                }
                UrlEncodedFormEntity encodedFormEntity = new UrlEncodedFormEntity(pairList, encode);
                httpPost.setEntity(encodedFormEntity);
            }
            httpResponse = httpClient.execute(httpPost);
            httpResponse.setHeader("Cache-Control", "no-cache");
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String result = EntityUtils.toString(httpResponse.getEntity(), encode);
                jsonObject = JSONObject.parseObject(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

    public JSONObject toGet(String url, Map<String, String> headers, String encode) {
        if (null == encode) {
            encode = "UTF-8";
        }
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = null;
        HttpResponse httpResponse = null;
        JSONObject jsonObject = null;
        try {
            httpGet = new HttpGet(url);
            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpGet.setHeader(entry.getKey(), entry.getValue());
                }
            }
            httpResponse = httpClient.execute(httpGet);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(httpEntity, encode);
                jsonObject = JSONObject.parseObject(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

    public JSONObject toPostByJsonString(String url, String jsonStr, Map<String, String> headers) {
        String encode = "UTF-8";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = null;
        HttpResponse httpResponse = null;
        JSONObject jsonObject = null;
        try {
            httpPost = new HttpPost(url);
            httpPost.setHeader("Content-type", "application/json");
            if (null != headers && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPost.setHeader(entry.getKey(), entry.getValue());
                }
            }

            StringEntity stringEntity = new StringEntity(jsonStr, encode);
            httpPost.setEntity(stringEntity);
            httpResponse = httpClient.execute(httpPost);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(httpEntity, encode);
                jsonObject = JSONObject.parseObject(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }
    // 发送带有 Basic Auth 和请求体参数的 POST 请求
    public static String sendTokenRequest(String username, String password, List<BasicNameValuePair> parameters) throws IOException,NoSuchAlgorithmException, KeyManagementException {
           // 创建一个 TrustManager，用于信任所有的 SSL 证书
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};

        // 获取一个 SSLContext 实例，并初始化 TrustManager
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

        // 设置全局默认的SSLSocketFactory，使RestTemplate使用禁用SSL证书验证的SSLContext
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), new UsernamePasswordCredentials(username, password));

        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();

        HttpPost httpPost = new HttpPost("https://iam.jpddc.com/oauth2/token");

        // 添加请求体参数
        httpPost.setEntity(new UrlEncodedFormEntity(parameters));

        // 设置请求头
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");

        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                return EntityUtils.toString(entity);
            } else {
                throw new IOException("Response entity is null");
            }
        } finally {
            response.close();
        }
    }

    public static void trustAllCertificates() throws NoSuchAlgorithmException, KeyManagementException {
        // 创建一个 TrustManager，用于信任所有的 SSL 证书
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};

        // 获取一个 SSLContext 实例，并初始化 TrustManager
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new SecureRandom());

        // 设置全局默认的SSLSocketFactory，使RestTemplate使用禁用SSL证书验证的SSLContext
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
    }
    public static String PostJson(String sendUrl, JSONObject body, Map<String, String> headers) {
        OutputStreamWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        HttpURLConnection conn = null;
        try {
            URL url = new URL(sendUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            //发送POST请求必须设置为true
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //设置连接超时时间和读取超时时间
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(10000);
            if(body!=null) {
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("Accept", "application/json");
            }else {
                conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=----footfoodapplicationrequestnetwork");
                conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8");
                conn.setRequestProperty("Accept", "*/*");
            }
            if (mapIsNotEmpty(headers)) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            //获取输出流
            OutputStream outputStream = conn.getOutputStream();
            out = new OutputStreamWriter(outputStream,"UTF-8");
            if(body!=null) {
                out.write(body.toString());
            }
            out.flush();
            out.close();
            //取得输入流，并使用Reader读取
            if (200 == conn.getResponseCode()) {
                in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                // in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
                String line;
                while ((line = in.readLine()) != null) {
                    result.append(line);
                    //System.out.println(line);
                }
            } else {
                //System.out.println("ResponseCode is an error code:" + conn.getResponseCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return result.toString();
    }

    public static String PostFormData(String urlStr, Map<String, String> urlParams, Map<String, String> headers, Map<String, String> fileMap) {
        String res = "";
        HttpURLConnection conn = null;
        DataInputStream in = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(10000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            if (mapIsNotEmpty(headers)) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
            OutputStream out = new DataOutputStream(conn.getOutputStream());
            // urlParams
            if (urlParams != null) {
                StringBuilder strBuf = new StringBuilder();
                Iterator<Map.Entry<String, String>> iter = urlParams.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry<String, String> entry = iter.next();
                    String inputName = entry.getKey();
                    String inputValue = entry.getValue();
                    if (inputValue == null) {
                        continue;
                    }
                    strBuf.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
                    strBuf.append("Content-Disposition: form-data; name=\"" + inputName + "\"\r\n\r\n");
                    strBuf.append(inputValue);
                }
                out.write(strBuf.toString().getBytes());
            }

            // file
            if (fileMap != null) {
                Iterator<Map.Entry<String, String>> iter = fileMap.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry<String, String> entry = iter.next();
                    String inputName = entry.getKey();
                    String inputValue = entry.getValue();
                    if (inputValue == null) {
                        continue;
                    }
                    File file = new File(inputValue);
                    if (!file.exists()) {

                        return res;
                    }                    String filename = file.getName();

                    StringBuilder strBuf = new StringBuilder();
                    strBuf.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
                    strBuf.append("Content-Disposition: form-data; name=\"" + inputName + "\"; filename=\"" + filename
                            + "\"\r\n");
                    strBuf.append("Content-Type:" + "multipart/form-data;boundary=" + "*****" + "\r\n\r\n");

                    out.write(strBuf.toString().getBytes());

                    in = new DataInputStream(new FileInputStream(file));
                    int bytes = 0;
                    byte[] bufferOut = new byte[1024];
                    while ((bytes = in.read(bufferOut)) != -1) {
                        out.write(bufferOut, 0, bytes);
                    }
                    in.close();
                }
            }

            byte[] endData = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
            out.write(endData);
            out.flush();
            out.close();

            // 读取返回数据
            StringBuilder strBuf = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                strBuf.append(line);
            }
            res = strBuf.toString();
            reader.close();
            reader = null;
        } catch (Exception e) {

        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                }
            }
        }
        return res;
    }
    private static boolean mapIsNotEmpty(Map<String, String> map) {
        if(map== null ||map .isEmpty())
            return false;
        return true;
    }

    public static Map<String, Object> createHttpResult(boolean success, Integer code, String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("success", success);
        result.put("code", code);
        result.put("message", message);
        return result;
    }
}
