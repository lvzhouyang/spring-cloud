package com.lzy.web;

import com.lzy.service.CompanyClient;
import com.lzy.service.EmployeeClient;
import com.lzy.service.ProductClient;
import com.lzy.vo.Company;
import com.lzy.vo.CompanyAll;
import com.lzy.vo.Employee;
import com.lzy.vo.Product;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@RestController
public class CompanyController {

    @Autowired
    private CompanyClient companyClient;
    @Autowired
    private ProductClient productClient;
    @Autowired
    private EmployeeClient employeeClient;

    @RequestMapping("/company/{id}")
    public CompanyAll getCompanyById(@PathVariable("id") Long id){
        System.out.println("Feign ConsumerController add");
        Company company = companyClient.getCompanyById(id);
        List<Product> productList = productClient.getProductsByCompanyId(company.getId());
        List<Employee> employees = employeeClient.getEmployeesByCompanyId(company.getId());
        CompanyAll companyAll = new CompanyAll(company, productList, employees);
        System.out.println(ToStringBuilder.reflectionToString(company));
        System.out.println(ToStringBuilder.reflectionToString(productList));
        return companyAll;
    }


}
