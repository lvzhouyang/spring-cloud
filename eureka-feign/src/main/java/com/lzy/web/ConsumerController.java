package com.lzy.web;

import com.lzy.service.ComputeClient;
import com.lzy.service.RibbonComputClient;
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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        System.out.println("Feign ConsumerController add");
        return ribbonComputClient.add(10, 20);
    }
}
