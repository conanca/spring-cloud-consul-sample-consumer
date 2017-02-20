package cn.news.sample.service;

import cn.news.sample.service.remote.HelloRemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by conanca on 17-2-15.
 */
@Service
public class HystrixWrappedHelloRemoteService {
    private static Logger logger = LoggerFactory.getLogger(HystrixWrappedHelloRemoteService.class);

    @Autowired
    HelloRemoteService helloRemoteService;

    /**
     * 远程服务调用失败时，就fallback，去执行timeout方法
     *
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallBackCall")
    public String greeting(String name) {
        String info = helloRemoteService.sayHello(name);
        logger.info(info);
        return info;
    }

    public String fallBackCall(String name) {
        return "FAILED SERVICE B CALL! - FALLING BACK";
    }


    /**
     * 远程服务调用超时（此处设置的是500毫秒）时，就fallback，去执行timeout方法
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "timeout", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
    })
    public String greeting2() {
        String info = helloRemoteService.sayHello2();
        logger.info(info);
        return info;
    }

    @HystrixCommand
    public String timeout() {
        return "Remote Timeout~";
    }
}
