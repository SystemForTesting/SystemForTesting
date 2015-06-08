package com.epam.testsystem.model;

import java.util.List;

public class Question extends BaseEntity {
    private String text;
    private Double weight;
    // todo list of images, or just one image?
    private byte[] image;
    private List<Answer> answers;
}
