package com.epam.testsystem.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.Duration;
import java.util.List;

@Entity
public class Test extends BaseEntity {
    private Double passMark;
    private Duration duration;
    @ManyToOne
    private User creator;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Question> questions;
}
