package com.lzy.service;

import com.lzy.vo.Employee;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@FeignClient(value = "employee-service",fallback = EmployeeClientHystrix.class)
public interface EmployeeClient {

    @RequestMapping("/employee/{id}")
    Employee getEmployeeById(@PathVariable("id") Long id);

    @RequestMapping("/employee")
    List<Employee> getEmployeesByCompanyId(@RequestParam("companyId") Long companyId);
}
