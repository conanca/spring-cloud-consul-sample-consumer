package com.dolplay.sample.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by conanca on 17-2-15.
 */
@FeignClient(name = "service-provider-demo")
public interface HelloRemoteService {
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String sayHello(@PathVariable("name") String name);

    @RequestMapping("hello2")
    String sayHello2();
}
