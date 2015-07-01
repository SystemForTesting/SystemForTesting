package com.epam.testsystem.action;

import com.epam.testsystem.form.TestListForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.repository.TestRepository;
import com.epam.testsystem.service.TestService;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestListActionTest {

    @InjectMocks
    private TestListAction testListAction;
    @Mock
    private TestService testService;
    @Mock
    private TestRepository testRepository;
    @Mock
    private TestListForm testListForm;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private ActionMapping mapping;

    @org.junit.Test
    public void testListActionForwardSuccessAndNotNull() throws Exception {
        ArrayList<Test> tests = new ArrayList<>();
        Test testOne = new Test();
        testOne.setId((long) 1);
        Test testTwo = new Test();
        testTwo.setId((long) 2);
        tests.add(testOne);
        tests.add(testTwo);

        testListForm.setTests(tests);
        when(testService.findAll()).thenReturn(tests);

        when(mapping.findForward("success")).thenReturn(new ActionForward("success"));

        ActionForward forward = testListAction.execute(mapping, testListForm, request, response);

        verify(testService).findAll();
        verify(mapping).findForward("success");

        assertNotNull(forward);
        assertEquals("success", forward.getPath());
    }
}