package com.spring.mvc.dao;

import com.spring.mvc.model.Login;
import com.spring.mvc.model.User;

public interface UserDao {
    void register(User user);
    User validateUser(Login login);
}
