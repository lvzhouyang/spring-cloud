package com.lzy.service;

import com.google.common.collect.Lists;
import com.lzy.vo.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@Component
public class ProductClientHystrix implements ProductClient {
    @Override
    public List<Product> getProductsByCompanyId(@RequestParam("companyId") Long companyId) {
        return Lists.newArrayList();
    }

    @Override
    public Product getProductById(@PathVariable("id") Long id) {
        return new Product();
    }
}
