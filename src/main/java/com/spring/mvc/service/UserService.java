package com.spring.mvc.service;

import com.spring.mvc.model.Login;
import com.spring.mvc.model.User;

public interface UserService {
    void register(User user);
    User validateUser(Login login);
}
