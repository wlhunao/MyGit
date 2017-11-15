package com.wl.quartz;

import com.wl.entity.User;
import com.wl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定义任务类
 */
@Component("myTask")
public class MyTask {

    @Autowired
    private UserService userService;
    public List<User> queryAllUser(){
      return userService.queryAllUser();
    }

}
