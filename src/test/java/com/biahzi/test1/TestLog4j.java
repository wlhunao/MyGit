package com.biahzi.test1;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestLog4j {

    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        List<User> list = userService.queryAllUser();
        System.out.println(list);
    }
    @Test
    public void test2(){

    }
}
