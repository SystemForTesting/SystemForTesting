package com.epam.testsystem.action;

import com.epam.testsystem.form.QuestionForm;
import com.epam.testsystem.service.QuestionService;
import org.apache.struts.action.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("/admin/questionDelete")
public class QuestionDeleteAction extends Action {

    @Autowired
    QuestionService questionService;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        QuestionForm questionForm = (QuestionForm) form;
        Long questionId = questionForm.getId();
        questionService.delete(questionId);

        Long testId = questionForm.getTestId();
        ActionRedirect redirect = new ActionRedirect(mapping.findForward("redirectToTest"));
        redirect.addParameter("id", testId);
        return redirect;
    }
}