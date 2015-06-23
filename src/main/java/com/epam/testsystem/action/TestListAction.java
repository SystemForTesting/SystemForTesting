package com.epam.testsystem.action;

import com.epam.testsystem.form.TestListForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.repository.TestRepository;
import com.epam.testsystem.service.TestService;
import org.apache.struts.action.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller("/admin/testList")
public class TestListAction extends Action {

    @Autowired
    TestService testService;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List<Test> tests = testService.findAll();
        TestListForm testListForm = (TestListForm) form;
        testListForm.setTests(tests);
        return mapping.findForward("success");
    }
}