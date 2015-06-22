package com.epam.testsystem.action;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.service.TestService;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("/admin/testAddEdit")
public class TestAddEditAction extends BaseAction<TestForm> {

    @Autowired
    TestService testService;

    @Override
    protected ActionForward onPost(ActionMapping mapping, TestForm form) {
        Test saved = testService.createOrUpdate(form);

        ActionRedirect redirect = new ActionRedirect(mapping.findForward("redirect"));
        redirect.addParameter("id", saved.getId());
        return redirect;
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, TestForm form) {
        Long id = form.getId();
        if (id != null) {
            Test test = testService.findById(id);
            form.map(test);
        }
        return mapping.findForward("success");
    }
}
