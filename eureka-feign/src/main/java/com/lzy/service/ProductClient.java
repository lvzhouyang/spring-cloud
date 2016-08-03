package com.lzy.service;

import com.lzy.vo.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@FeignClient(value = "product-service",fallback = ProductClientHystrix.class)
public interface ProductClient {

    @RequestMapping("/product")
    List<Product> getProductsByCompanyId(@RequestParam("companyId") Long companyId);

    @RequestMapping("/product/{id}")
    Product getProductById(@PathVariable("id") Long id);
}
