package com.lzy.web;

import com.lzy.vo.Company;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@RestController
public class CompanyServiceController {

    @RequestMapping("/company/{id}")
    public Company getCompanyById(@PathVariable("id") Long id){
        sleep();
        return new Company(id, "Company");
    }

    //利用时间等待模拟Serivce调用时长
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
