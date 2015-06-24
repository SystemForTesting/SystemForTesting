package com.epam.testsystem.repository;

import com.epam.testsystem.model.User;

public interface UserRepository extends CustomCrudRepository<User> {
    User findByUsername(String username);
}
