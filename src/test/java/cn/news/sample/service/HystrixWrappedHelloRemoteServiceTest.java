package cn.news.sample.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by conanca on 17-2-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HystrixWrappedHelloRemoteServiceTest {
    @Autowired
    private HystrixWrappedHelloRemoteService hystrixWrappedHelloRemoteService;
    @Test
    public void testGreeting(){
        String info  = hystrixWrappedHelloRemoteService.greeting("test");
    }
}
