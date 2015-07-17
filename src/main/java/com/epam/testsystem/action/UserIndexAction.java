package com.epam.testsystem.action;

import com.epam.testsystem.model.User;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;
import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.epam.testsystem.util.SpringUtils.getCurrentlyAuthenticatedUser;

@Controller("/index")
public class UserIndexAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = getCurrentlyAuthenticatedUser();

        request.setAttribute("user", user);
        return mapping.findForward("success");
    }
}
