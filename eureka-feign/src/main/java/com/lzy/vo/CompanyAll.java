package com.lzy.vo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lvzhouyang on 16/8/3.
 */
public class CompanyAll {
    private Long id;
    private String name;
    private List<ProductDetail> productList;
    private List<EmployeeDetail> employeeList;

    public CompanyAll() {
    }

    public CompanyAll(Company company, List<Product> productList, List<Employee> employeeList) {
        this.id = company.getId();
        this.name = company.getName();
        if (employeeList != null) {
            this.productList = productList.stream().map(product ->
                    new ProductDetail(product.getId(), product.getSku())
            ).collect(Collectors.toList());
        }

        if (employeeList != null) {
            this.employeeList = employeeList.stream().map(employee ->
                    new EmployeeDetail(employee.getId(), employee.getName())
            ).collect(Collectors.toList());
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductDetail> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDetail> productList) {
        this.productList = productList;
    }

    public List<EmployeeDetail> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeDetail> employeeList) {
        this.employeeList = employeeList;
    }
}
