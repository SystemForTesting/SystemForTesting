package com.epam.testsystem.form;

import com.epam.testsystem.model.User;
import org.apache.struts.action.ActionForm;

import java.util.ArrayList;
import java.util.List;

public class UserListForm extends ActionForm {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
