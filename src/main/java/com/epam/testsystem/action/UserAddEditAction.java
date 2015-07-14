package com.epam.testsystem.action;

import com.epam.testsystem.form.UserForm;
import com.epam.testsystem.model.Role;
import com.epam.testsystem.model.User;
import com.epam.testsystem.service.RoleService;
import com.epam.testsystem.service.UserService;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("/admin/userAddEdit")
public class UserAddEditAction extends BaseAction<UserForm> {

    @Autowired
    public UserService userService;
    @Autowired
    public RoleService roleService;

    @Override
    protected ActionForward onPost(ActionMapping mapping, UserForm form) {
        User user = form.getUser();
        Role userRole = roleService.findById((long) 2);
        user.setRole(userRole);
        User savedUser = userService.save(user);
        System.out.println(savedUser);
        return mapping.findForward("redirect");
    }

    @Override
    protected ActionForward onGet(ActionMapping mapping, UserForm form) {
        return mapping.findForward("success");
    }
}
