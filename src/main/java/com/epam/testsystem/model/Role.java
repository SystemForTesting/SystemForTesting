package com.epam.testsystem.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role extends BaseEntity {
    private String role;

    @ManyToMany
    private List<Permission> permissions;
}
