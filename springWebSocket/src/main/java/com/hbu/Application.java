package com.hbu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.run;

/**
 * Created by chenwei on 2018/2/3.
 */

@ComponentScan(basePackages = "com.hbu")
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args){
        ConfigurableApplicationContext run = run(Application.class, args);
    }
}
