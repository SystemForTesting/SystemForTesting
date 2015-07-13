package com.epam.testsystem.repository;

import com.epam.testsystem.model.User;

import java.util.List;

public interface UserRepository extends BaseRepository<User> {

    User findByUsername(String username);

    List<User> findByRole_Name(String roleName);
}
