package com.jtzeng.springmvc.util;

import com.pdd.pop.sdk.http.PopHttpClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class PddClient {
    private static PopHttpClient popHttpClient;
    @Resource
    private MyProperties myProperties;

    public PopHttpClient getPopHttpClient(){
        if (popHttpClient==null)
            popHttpClient=new PopHttpClient(myProperties.getApiServerUrl(),myProperties.getClientId(),myProperties.getClientSecret());
        return  popHttpClient;
    }
    public String getAccessToken(){
        return "";
    }
}
