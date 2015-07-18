package com.epam.testsystem.service;

import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestCaseService extends BaseService<TestCase, TestCaseRepository> {

    @Autowired
    public TestCaseService(TestCaseRepository repository) {
        super(repository);
    }

        @Transactional
    public List<TestCase> findByUserId(Long id) {
        return (List<TestCase>) repository.findByUser_Id(id);
    }

    public void deleteByUserIdAndTestIdNotIn(String user_id,List<String> testIds){
        List<Long> longs = new ArrayList<>();
        for (String testId : testIds) {
            longs.add(Long.parseLong(testId, 10));
        }

//        repository.deleteByUser_IdAndTest_IdNotIn(Long.parseLong(user_id, 10), longs);
    }
}
