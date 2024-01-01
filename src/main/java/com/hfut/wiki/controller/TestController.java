package com.hfut.wiki.controller;

import com.hfut.wiki.domain.Test;
import com.hfut.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello:TEST}")
    private  String testHello;

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return testHello+ "Hello World!";
    }

    @GetMapping("test/list")
    public List<Test> list(){
        return testService.list();
    }
}
