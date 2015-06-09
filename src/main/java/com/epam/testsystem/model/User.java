package com.epam.testsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DBUSER")
public class User extends BaseEntity {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    // todo change to onetoone and add permissions?
    @OneToOne
    private Role role;

    // todo remove? if not remove fetchtype?
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<TestCase> testCases;
}
