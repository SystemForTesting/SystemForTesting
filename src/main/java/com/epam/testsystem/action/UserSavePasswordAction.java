package com.epam.testsystem.action;

import com.epam.testsystem.form.UserForm;
import com.epam.testsystem.model.User;
import com.epam.testsystem.service.UserService;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import static com.epam.testsystem.util.SecurityUtils.getCurrentlyAuthenticatedUser;

@Controller("/saveNewPassword")
public class UserSavePasswordAction extends BaseAction<UserForm> {

    @Autowired
    public UserService userService;

    @Override
    protected ActionForward onPost(ActionMapping mapping, UserForm form) {
        User user = getCurrentlyAuthenticatedUser();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if (!encoder.matches(form.getUser().getPassword(), user.getPassword())) return mapping.findForward("saveError");
        String newPassword = form.getNewPassword();
        if (!newPassword.equals(form.getConfirmPassword())) return mapping.findForward("saveError");

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(newPassword);
        System.out.println(encodedPassword);

        user.setPassword(encodedPassword);
        userService.save(user);
        return mapping.findForward("success");
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, UserForm form) {
        return mapping.findForward("success");
    }
}
