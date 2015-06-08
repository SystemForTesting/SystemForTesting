package com.epam.testsystem.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class User extends BaseEntity {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private List<Role> roles;
}
