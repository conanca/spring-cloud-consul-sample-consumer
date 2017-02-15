package cn.news.sample.service;

import cn.news.sample.service.remote.HelloRemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by conanca on 17-2-15.
 */
@Service
public class HystrixWrappedHelloRemoteService {
    @Autowired
    HelloRemoteService helloRemoteService;

    @HystrixCommand(fallbackMethod = "fallBackCall")
    public String greeting(String name) {
        String info = helloRemoteService.sayHello(name);
        System.out.println(info);
        return info;
    }

    public String fallBackCall(String name) {
        return "FAILED SERVICE B CALL! - FALLING BACK";
    }
}
