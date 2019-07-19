package com.jtzeng.springmvc.util;

import com.pdd.pop.sdk.http.PopHttpClient;

import javax.annotation.Resource;

public class PddClient {
    private static PopHttpClient popHttpClient;
    @Resource
    static private MyProperties myProperties;
    private PddClient(){}
    public static synchronized  PopHttpClient getPopHttpClient(){
        if (popHttpClient==null)
            popHttpClient=new PopHttpClient(myProperties.getApiServerUrl(),myProperties.getClientId(),myProperties.getClientSecret());
        return  popHttpClient;
    }
}
