package com.vvx.thepastbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.vvx.thepastbackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class ThePastBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThePastBackendApplication.class, args);
    }

}
