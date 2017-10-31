package com.spring.mvc.service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.Login;
import com.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultUserService implements UserService {
    @Autowired
    UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
