package com.epam.testsystem.service;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.TestRepository;
import com.epam.testsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.epam.testsystem.util.SecurityUtils.getCurrentlyAuthenticatedUser;

@Service
public class UserService extends BaseService<User> {
    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
    }


}
