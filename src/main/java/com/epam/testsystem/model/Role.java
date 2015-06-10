package com.epam.testsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role extends BaseEntity {
    private String roleName;
}
