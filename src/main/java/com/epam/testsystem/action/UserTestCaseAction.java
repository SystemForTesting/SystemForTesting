package com.epam.testsystem.action;

import com.epam.testsystem.form.QuestionListForm;
import com.epam.testsystem.form.TestCaseForm;
import com.epam.testsystem.model.Answer;
import com.epam.testsystem.model.Question;
import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.service.QuestionService;
import com.epam.testsystem.service.TestCaseService;
import com.epam.testsystem.service.TestService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller("/test")
public class UserTestCaseAction extends BaseAction<TestCaseForm> {

    @Autowired
    TestCaseService testCaseService;

    @Override
    protected ActionForward onPost(ActionMapping mapping, TestCaseForm form) {
//        Test saved = testService.createOrUpdate(form);
//
//        ActionRedirect redirect = new ActionRedirect(mapping.findForward("redirect"));
//        redirect.addParameter("id", saved.getId());
        return null;
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, TestCaseForm form) {
        Long id = form.getId();
        if (id != null) {
            TestCase testCase = testCaseService.findById(id);
            form.map(testCase);
            ArrayList<Answer> answers = new ArrayList<>();
            Answer answer = new Answer();
            answer.setText("just testing");
            answer.setRight(false);
            answers.add(answer);
            form.setAnswers(answers);
        }
        return mapping.findForward("success");
    }
}
