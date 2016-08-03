package com.lzy.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@Component
public class RibbonComputClientHystrix implements RibbonComputClient{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
