package com.epam.testsystem.repository;

import com.epam.testsystem.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
