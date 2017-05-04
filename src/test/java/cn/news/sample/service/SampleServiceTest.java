package com.dolplay.sample.service;

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
public class SampleServiceTest {
    @Autowired
    private SampleService sampleService;
    @Test
    public void testGreeting(){
        sampleService.greeting("test");
    }
}
