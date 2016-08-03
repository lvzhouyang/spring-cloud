package com.lzy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@SpringBootApplication
@EnableTurbine
public class TurbineAppication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineAppication.class).web(true).run(args);
    }
}
