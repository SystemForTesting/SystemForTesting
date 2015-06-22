package com.epam.testsystem.service;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.epam.testsystem.util.SecurityUtils.getCurrentlyAuthenticatedUser;

@Service
public class TestService {
    @Autowired
    TestRepository testRepository;

    public Test findById(Long id) {
        return testRepository.findOne(id);
    }

    public Test createOrUpdate(TestForm form) {
        User user = getCurrentlyAuthenticatedUser();
        Long id = form.getId();
        Test test;
        if(id == null || id.equals(0L)) {
            test = new Test();
            test.setCreatedBy(user);
        } else {
            test = testRepository.findOne(form.getId());
            test.setUpdatedBy(user);
        }
        form.updateTest(test);
        Test saved = testRepository.save(test);
        return saved;
    }
}
