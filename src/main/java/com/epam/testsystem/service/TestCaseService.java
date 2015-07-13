package com.epam.testsystem.service;

import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCaseService extends BaseService<TestCase, TestCaseRepository> {

    @Autowired
    public TestCaseService(TestCaseRepository repository) {
        super(repository);
    }
}
