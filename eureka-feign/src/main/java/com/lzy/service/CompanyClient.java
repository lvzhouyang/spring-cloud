package com.lzy.service;

import com.lzy.vo.Company;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@FeignClient(value = "company-service",fallback = CompanyClientHystrix.class)
public interface CompanyClient {

    @RequestMapping(method = RequestMethod.GET, value = "/company/{id}")
    Company getCompanyById(@PathVariable("id") Long id);
}
