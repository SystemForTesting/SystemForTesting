package com.epam.testsystem.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Question extends BaseEntity {
    private String title;
    private Double weight;

    @OneToMany
    private List<Image> images;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
