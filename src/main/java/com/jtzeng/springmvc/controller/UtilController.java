package com.jtzeng.springmvc.controller;

import com.jtzeng.springmvc.entity.ComEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pdd/util")
public class UtilController {
    @RequestMapping("/time/get")
    public String timeGet(ComEntity param){
        return null;
    }
    @RequestMapping("/divide/base64/image")
    public String divideBase64Image(ComEntity param){
        return null;
    }
    @RequestMapping("/divide/image")
    public String divideImage(ComEntity param){
        return null;
    }
}
