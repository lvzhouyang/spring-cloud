package com.lzy.web;

import com.lzy.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Integer a,Integer b) {
        System.out.println("ConsumerController add");
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a="+a+"&b="+b+"", String.class).getBody();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hystrixCommand() {
        System.out.println("hystrixCommand");
        return computeService.addService();
    }
}
