package com.lzy.web;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.lzy.conf.DataSourceProperties;
import com.lzy.service.ComputeClient;
import com.lzy.service.RibbonComputClient;
import com.lzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@RestController
public class ConsumerController {
    @Autowired
    private ComputeClient computeClient;
    @Autowired
    private RibbonComputClient ribbonComputClient;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        System.out.println("Feign ConsumerController add");
        return ribbonComputClient.add(10, 20);
    }

    @JsonSerialize
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String  get(){
        return JSON.toJSONString(userService.searchAll());
    }
}
