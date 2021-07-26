package com.rdc.utils;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HttpRequest {

    public static List<HashMap> httpGet(String httpUrl) {
        try {
            URL url = new URL(httpUrl);
            // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 设置连接方式：get
            connection.setRequestMethod("GET");
            // 设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(60000);

            // 发送请求
            connection.connect();

            // 通过connection连接，获取输入流
            //得到响应流
            InputStream inputStream = connection.getInputStream();
            //获取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            List<HashMap> hashMaps = new ArrayList<>();
            while ((line = reader.readLine()) != null){
                HashMap hashMap = JSONObject.parseObject(line, HashMap.class);
                hashMaps.add(hashMap);
            }
            reader.close();
            connection.disconnect();

            return hashMaps;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
