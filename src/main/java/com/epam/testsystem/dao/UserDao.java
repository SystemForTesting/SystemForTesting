package com.epam.testsystem.dao;

import com.epam.testsystem.model.User;

public interface UserDao {
    User findByCredentials(User user);

    User findByName(String username);
}
