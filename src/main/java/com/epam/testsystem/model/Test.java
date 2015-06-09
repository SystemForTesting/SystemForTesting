package com.epam.testsystem.model;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Entity
public class Test extends BaseEntity {
    // todo check if one value or many ranges or nothing at all
    private String passMark;
    private Duration duration;
    @ManyToOne
    private User creator;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Question> questions;
}
