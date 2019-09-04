package com.example.dockertest.service;

import com.example.dockertest.dao.UserDao;
import com.example.dockertest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jayMamba
 * @date 2019/9/4
 * @time 16:02
 * @desc
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo() {
      return   userDao.selectById("1");
    }
}
