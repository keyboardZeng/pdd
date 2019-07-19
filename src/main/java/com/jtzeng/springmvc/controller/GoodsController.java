package com.jtzeng.springmvc.controller;

import com.jtzeng.springmvc.entity.ComEntity;
import com.jtzeng.springmvc.serviceI.GoodsServiceI;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pdd/goods")
public class GoodsController {
    @Resource
    private GoodsServiceI goodsServiceImpl;
    @RequestMapping("/test")
    public String test(@RequestBody ComEntity param){
        return param.toString();
    }
    @RequestMapping("/cats/get")
    public String catsGet(@RequestBody ComEntity param){
        return goodsServiceImpl.catsGet(param);
    }
    @RequestMapping("/opt/get")
    public String optGet(@RequestBody ComEntity param){
        return goodsServiceImpl.optGet(param);
    }
    @RequestMapping("/cps/unit/delete")
    public String cpsUnitGet(@RequestBody ComEntity param){
        return goodsServiceImpl.cpsUnitGet(param);
    }
}
