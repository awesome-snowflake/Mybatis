package com.wxf.dao;

import com.wxf.entity.User;

public interface UserDao {
    public User selectUserById(Integer id);
}
