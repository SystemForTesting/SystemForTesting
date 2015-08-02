package com.epam.testsystem.action;

import com.epam.testsystem.form.TestCaseForm;
import com.epam.testsystem.form.TestCaseListForm;
import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.model.User;
import com.epam.testsystem.service.TestCaseService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static com.epam.testsystem.util.SpringUtils.getCurrentlyAuthenticatedUser;

@Controller("/index")
public class UserIndexAction extends Action {

    @Autowired
    TestCaseService testCaseService;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = getCurrentlyAuthenticatedUser();

        TestCaseListForm testCaseListForm = (TestCaseListForm) form;

        List<TestCase> testCases = testCaseService.findByUserId(user.getId());

        for (TestCase testCase : testCases) {
            testCaseListForm.setAddTestCaseForm(new TestCaseForm(testCase));
        }

        request.setAttribute("user", user);
        return mapping.findForward("success");
    }
}
