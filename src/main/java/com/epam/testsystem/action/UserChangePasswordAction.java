package com.epam.testsystem.action;

import com.epam.testsystem.form.UserForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

@Controller("/changePassword")
public class UserChangePasswordAction extends BaseAction<UserForm> {

    @Override
    protected ActionForward onPost(ActionMapping mapping, UserForm form) {
        return mapping.findForward("success");
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, UserForm form) {
        return mapping.findForward("success");
    }
}
