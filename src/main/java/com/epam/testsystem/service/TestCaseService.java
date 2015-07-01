package com.epam.testsystem.service;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.TestCaseRepository;
import com.epam.testsystem.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.epam.testsystem.util.SecurityUtils.getCurrentlyAuthenticatedUser;

@Service
public class TestCaseService extends BaseService<TestCase> {
    @Autowired
    public TestCaseService(TestCaseRepository repository) {
        super(repository);
    }
}
