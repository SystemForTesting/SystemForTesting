package com.epam.testsystem.action;

import com.epam.testsystem.form.QuestionListForm;
import com.epam.testsystem.model.Question;
import com.epam.testsystem.repository.BaseRepository;
import com.epam.testsystem.service.QuestionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import servletunit.struts.MockStrutsTestCase;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QuestionListActionTest extends MockStrutsTestCase  {

    @InjectMocks
    private QuestionService questionService;
    @Mock
    private BaseRepository<Question> repository;
    @Mock
    private QuestionListForm questionListForm;
    private List<Question> questions = new ArrayList<>();

    @Test
    public void testSuccessfulQuestion() throws Exception {
        Question questionOne = new Question();
        questionOne.setId((long) 1);
        Question questionTwo = new Question();
        questionTwo.setId((long) 2);
        questions.add(questionOne);
        questions.add(questionTwo);

        when(questionService.findAll()).thenReturn(questions);
        setConfigFile("/WEB-INF/struts-config.xml");
        setRequestPathInfo("/admin/questionList.do");
        addRequestParameter("question", String.valueOf(questions.get(0).getId()));
        actionPerform();
        verifyForward("success");

        assertEquals("1",(String) getSession().getAttribute("question"));
    }
}