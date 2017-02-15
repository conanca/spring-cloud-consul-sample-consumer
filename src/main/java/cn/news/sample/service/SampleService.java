package cn.news.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by conanca on 17-2-14.
 */
@Service
public class SampleService {
    @Autowired
    HelloRemoteService helloRemoteService;

    public String greeting(String name) {
        String info = helloRemoteService.sayHello(name);
        System.out.println(info);
        return info;
    }
}
