package com.epam.testsystem.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends BaseEntity {
    private String text;
    private boolean right;
    @ManyToOne
    private Question question;
}
