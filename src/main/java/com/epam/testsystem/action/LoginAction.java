package com.epam.testsystem.action;

import com.epam.testsystem.form.UserForm;
import com.epam.testsystem.model.User;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter writer = response.getWriter();
        UserForm userForm = (UserForm) form;

        String method = request.getMethod();
        if (method.equals("POST")) {
            writer.println(userForm.getUser().getUsername());
            writer.println(userForm.getUser().getUsername());
        } else {
            User user = new User();
            ((UserForm) form).setUser(user);
        }
        return mapping.findForward("success");

    }
}
