package com.atroot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.atroot.admin") //指定原生servlet的扫描路径
public class SpringBootMvc02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMvc02Application.class, args);
    }

}
