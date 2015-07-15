package com.epam.testsystem.action;

import com.epam.testsystem.form.UserForm;
import com.epam.testsystem.model.Role;
import com.epam.testsystem.model.User;
import com.epam.testsystem.service.RoleService;
import com.epam.testsystem.service.UserService;
import com.epam.testsystem.util.MailHelper;
import com.epam.testsystem.util.SmtpMessageSender;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

import static com.epam.testsystem.util.MailHelper.sendEmail;

@Controller("/admin/userAddEdit")
public class UserAddEditAction extends BaseAction<UserForm> {

    @Autowired
    public UserService userService;
    @Autowired
    public RoleService roleService;
    @Autowired
    public Session session;

    @Override
    protected ActionForward onPost(ActionMapping mapping, UserForm form) {
        try {
            User user = form.getUser();
            Role userRole = roleService.findById((long) 2);
            user.setRole(userRole);

            String email = user.getEmail();
            sendEmail(session, email);

            userService.save(user);
            return mapping.findForward("redirect");
        } catch (MessagingException | IOException e) {
            throw new ActionException(e);
        }
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, UserForm form) {
        return mapping.findForward("success");
    }
}
