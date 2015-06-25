package com.epam.testsystem.service;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.epam.testsystem.util.SecurityUtils.getCurrentlyAuthenticatedUser;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    @Transactional
    public Test findById(Long id) {
        Test test = testRepository.findOne(id);
        test.getQuestions();
        return test;
    }

    @Transactional
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

    @Transactional
    public List<Test> findAll() {
        List<Test> all = (List<Test>) testRepository.findAll();
        return all;
    }

    public void delete(Long id) {
        testRepository.delete(id);

    }
}
