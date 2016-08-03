package com.lzy.service;

import com.google.common.collect.Lists;
import com.lzy.vo.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@Component
public class EmployeeClientHystrix implements EmployeeClient{
    @Override
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return new Employee();
    }

    @Override
    public List<Employee> getEmployeesByCompanyId(@RequestParam("companyId") Long companyId) {
        return Lists.newArrayList();
    }
}
