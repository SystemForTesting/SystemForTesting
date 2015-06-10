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
    @ManyToOne
    private Role role;

    @OneToMany(fetch = FetchType.LAZY)
    private List<TestCase> testCases;
}
