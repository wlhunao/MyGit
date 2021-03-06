package com.wl.service;

import com.wl.dao.UserDAO;
import com.wl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> queryAllUser() {
        return userDAO.selectAllUser();
    }
}
