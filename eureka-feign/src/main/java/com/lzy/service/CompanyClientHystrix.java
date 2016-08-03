package com.lzy.service;

import com.lzy.vo.Company;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@Component
public class CompanyClientHystrix implements CompanyClient{
    @Override
    public Company getCompanyById(@PathVariable("id") Long id) {
        return new Company(1l,"default");
    }
}
