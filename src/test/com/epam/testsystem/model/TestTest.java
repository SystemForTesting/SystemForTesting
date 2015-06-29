package com.epam.testsystem.model;

import com.epam.testsystem.repository.BaseRepository;
import com.epam.testsystem.service.TestService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestTest {

    @InjectMocks
    private TestService testService;
    @Mock
    private BaseRepository<Test> repository;

    @Before
    public void setUp(BaseRepository<Test> repository) throws Exception {
        this.repository = repository;
    }

    @org.junit.Test
    public void testCreateOrUpdate() {
        User user = new User();
        user.setId((long) 1);
        Test test;
        Long userId = user.getId();
        if(userId == null || userId.equals(0L)) {
            test = new Test();
            test.setCreatedBy(user);
        } else {
            test = repository.findOne(form.getId());
            test.setUpdatedBy(user);
        }
        form.update(test);
        Test saved = repository.save(test);
        return saved;
    }
    }
}