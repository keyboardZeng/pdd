package com.jtzeng.springmvc.controller;

import com.jtzeng.springmvc.entity.ComEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pdd/goods")
public class GoodsController {
    @RequestMapping("/cats/get")
    public String catsGet(ComEntity param){
        return null;
    }
    @RequestMapping("/opt/get")
    public String optGet(ComEntity param){
        return null;
    }
    @RequestMapping("/cps/unit/delete")
    public String cpsUnitGet(ComEntity param){
        return null;
    }
}
