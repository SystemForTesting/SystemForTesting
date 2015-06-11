package com.epam.testsystem.form;

import com.epam.testsystem.model.User;
import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
