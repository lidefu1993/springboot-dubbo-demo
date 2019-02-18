package com.ldf.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ldf.dubbo.demo.api.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lidefu
 * @date 2019/2/18 16:28
 */
@SpringBootApplication
@RestController
public class ConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }

    @Reference
    private ITestService testService;

    @GetMapping("test")
    public String test(){
        System.out.println("test------------------");
        return testService.test();
    }
}
