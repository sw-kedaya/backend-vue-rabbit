package com.cc.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class InitJsonByURL {
    private final String originUrl = "http://pcapi-xiaotuxian-front-devtest.itheima.net";
    public String getBrandAndSalePropertyJson(Long id){
        String subUrl = "/category/sub/filter?id=" + id;
        try {
            URL url = new URL(originUrl + subUrl);
            HttpURLConnection uc = (HttpURLConnection)url.openConnection();

            if (!(uc.getResponseCode() == 200)){
                return null;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(), StandardCharsets.UTF_8));
            String line;
            StringBuilder json = new StringBuilder();
            while ((line = in.readLine()) != null) {
                json.append(line);
            }

            in.close();

            return json.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
