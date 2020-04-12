package com.spring.react.main;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringReactApplication {

    public static void main(String[] args) {
        System.out.println("asdasd");
        List<Integer> list=new ArrayList<>();
        System.out.println("asd="+list.get(0));
        SpringApplication.run(SpringReactApplication.class, args);
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTask() {
        System.out.println("Fixed rate task - " + new Date());
    }

}