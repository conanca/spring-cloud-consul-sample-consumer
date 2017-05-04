package com.dolplay.sample.controller;

import com.dolplay.sample.service.HystrixWrappedHelloRemoteService;
import com.dolplay.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by conanca on 17-2-22.
 */
public class HelloController {

    @Autowired
    private SampleService sampleService;
    @Autowired
    private HystrixWrappedHelloRemoteService hystrixWrappedHelloRemoteService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return sampleService.greeting("test~~~~~");
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return hystrixWrappedHelloRemoteService.greeting("test~~~xx~~~");
    }

    @RequestMapping("/greeting2")
    @ResponseBody
    public String greeting2() {
        return hystrixWrappedHelloRemoteService.greeting2();
    }
}
