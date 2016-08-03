package com.lzy.service;

import com.lzy.vo.Company;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@Service
public class CompanyService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serviceFallback")
    public Company addService(String id) {
        return restTemplate.getForEntity("http://COMPANY-SERVICE/company/" + id, Company.class).getBody();
    }

    public Company serviceFallback(String id) {
        return new Company(1L,"DEFAULT");
    }
}
