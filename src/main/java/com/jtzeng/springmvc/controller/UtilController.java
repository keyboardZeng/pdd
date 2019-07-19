package com.jtzeng.springmvc.controller;

import com.jtzeng.springmvc.entity.ComEntity;
import com.jtzeng.springmvc.serviceI.UtilServiceI;
import com.jtzeng.springmvc.serviceImpl.UtilServiceImpl;
import com.jtzeng.springmvc.util.MyProperties;
import com.jtzeng.springmvc.util.PddClient;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;
import com.pdd.pop.sdk.http.api.request.PddTimeGetRequest;
import com.pdd.pop.sdk.http.api.request.PddUtilDivideBase64ImageRequest;
import com.pdd.pop.sdk.http.api.request.PddUtilDivideImageRequest;
import com.pdd.pop.sdk.http.api.response.PddTimeGetResponse;
import com.pdd.pop.sdk.http.api.response.PddUtilDivideBase64ImageResponse;
import com.pdd.pop.sdk.http.api.response.PddUtilDivideImageResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pdd/util")
public class UtilController {
    @Resource
    private UtilServiceI utilServiceImpl;
    @RequestMapping("/time/get")
    public String timeGet(@RequestBody ComEntity param){
        return utilServiceImpl.timeGet(param);
    }
    @RequestMapping("/divide/base64/image")
    public String divideBase64Image(@RequestBody ComEntity param){
        return utilServiceImpl.divideBase64Image(param);
    }
    @RequestMapping("/divide/image")
    public String divideImage(@RequestBody ComEntity param){
        return utilServiceImpl.divideImage(param);
    }
}
