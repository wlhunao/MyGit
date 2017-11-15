package com.wl.dao;

import com.wl.entity.User;

import java.util.List;

public interface UserDAO {

        List<User> selectAllUser();
}
