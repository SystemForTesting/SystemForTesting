package com.epam.testsystem.service;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.BaseRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {

    @InjectMocks
    private TestService testService;
    @Mock
    private BaseRepository<Test> repository;
    @Mock
    private TestForm testForm;

    @org.junit.Test
    public void testCreate() {
        /*Arrange*/
        User authenticatedUser = new User();
        authenticatedUser.setId((long) 1);
        authenticatedUser.setFirstName("FirstName");
        authenticatedUser.setPassword("password");

        Long authenticatedUserId = authenticatedUser.getId();

        Test test = new Test();
        test.setCreatedBy(authenticatedUser);

        /*Act*/
        when(repository.findOne(authenticatedUserId)).thenReturn(test);
        when(repository.save(test)).thenReturn(test);

        /*Assert*/
        assertEquals(new Long(1), test.getCreatedBy().getId());
    }

    @org.junit.Test
    public void testUpdate() {
        User authenticatedUser = new User();
        authenticatedUser.setId((long) 1);
        authenticatedUser.setFirstName("FirstName");
        authenticatedUser.setPassword("password");

        Long authenticatedUserId = authenticatedUser.getId();

        Test test = new Test();
        test.setCreatedBy(authenticatedUser);

        User updatedUser = new User();
        updatedUser.setId((long) 2);
        test.setUpdatedBy(updatedUser);

        /*Act*/
        when(repository.findOne(authenticatedUserId)).thenReturn(test);
        when(repository.save(test)).thenReturn(test);

        /*Assert*/
        assertEquals(new Long(2), test.getUpdatedBy().getId());
    }
}

