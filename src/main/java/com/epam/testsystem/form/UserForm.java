package com.epam.testsystem.form;

import com.epam.testsystem.model.User;

public class UserForm extends BaseForm<User> {

    private User user;

    public User getUser() {
        if (this.user == null) {
            setUser(new User());
        }
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void map(User user) {

    }

    @Override
    public void update(User user) {

    }

    public String getCredentials() {
        return user.getLastName() + " " + user.getFirstName().substring(0, 1) + ".";
    }
}
