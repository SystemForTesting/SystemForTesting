package com.epam.testsystem.action;

import com.epam.testsystem.dao.DaoFactory;
import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.form.UserForm;
import com.epam.testsystem.model.User;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


public class LoginAction extends BaseAction<UserForm> {
    private static final Logger LOG= LoggerFactory.getLogger(LoginAction.class);
    @Override
    protected ActionForward onPost(ActionMapping mapping, UserForm form, HttpServletRequest request) {
        User loginPassword = form.getUser();
        User user = getUserDao().findByCredentials(loginPassword);
        request.setAttribute("role", user.getRoleName());
        if (user != null) {
            return mapping.findForward("redirect");
        } else {
            return mapping.findForward("success");
        }
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, UserForm form) {
        User user = new User();
        form.setUser(user);
        return mapping.findForward("success");
    }

    private UserDao getUserDao() {
        return DaoFactory.getInstance().getDao(User.class);
    }
}
