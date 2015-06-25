package com.epam.testsystem.repository;

import com.epam.testsystem.model.User;

public interface UserRepository extends BaseRepository<User> {
    User findByUsername(String username);
}
