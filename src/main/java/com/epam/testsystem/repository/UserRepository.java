package com.epam.testsystem.repository;

import com.epam.testsystem.model.User;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
