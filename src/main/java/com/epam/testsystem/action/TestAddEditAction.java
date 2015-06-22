package com.epam.testsystem.action;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.TestRepository;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

import static com.epam.testsystem.util.SecurityUtils.*;

@Controller("/admin/testAddEdit")
public class TestAddEditAction extends BaseAction<TestForm> {

    @Autowired
    TestRepository testRepository;

    @Override
    protected ActionForward onPost(ActionMapping mapping, TestForm form) {
        Test test = form.getTest();
        User user = getCurrentlyAuthenticatedUser();
        // todo problem: id input field can be modified by javacript
        if(test.getId() == null || test.getId().equals(0L)) {
            test.setCreatedBy(user);
        } else {
            test.setUpdatedBy(user);
        }
        Test saved = testRepository.save(test);

        ActionRedirect redirect = new ActionRedirect(mapping.findForward("redirect"));
        redirect.addParameter("id", saved.getId());
        return redirect;
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, TestForm form) {
        Long id = form.getId();
        if (id != null) {
            Test test = testRepository.findOne(id);
            // new Test() is called to clean up test id
            form.setTest(test != null ? test : new Test());
        }
        return mapping.findForward("success");
    }
}
