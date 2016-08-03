package com.lzy.web;

import com.google.common.collect.Lists;
import com.lzy.vo.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@RestController
public class EmployeeController {

    @RequestMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {

        sleep();
        return new Employee(id,1L,"张三");
    }

    @RequestMapping("/employee")
    public List<Employee> getEmployeesByCompanyId(@RequestParam("companyId") Long companyId){
        List<Employee> employees = Lists.newArrayList();

        employees.add(new Employee(1L, companyId, "张三"));
        employees.add(new Employee(2L, companyId, "李四"));
        employees.add(new Employee(3L, companyId, "王五"));

        sleep();
        return employees;
    }

    private void sleep() {
        Random rand = new Random();
        int time = rand.nextInt(20);

        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
