package com.epam.testsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question extends BaseEntity {
    private String text;
    private Double weight;
    // todo list of images, or just one image?
    @Lob
    @Column(nullable=false, columnDefinition="mediumblob")
    private byte[] image;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
