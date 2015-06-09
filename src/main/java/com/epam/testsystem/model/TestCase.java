package com.epam.testsystem.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class TestCase extends BaseEntity {
    private LocalDateTime startedAt;

    @ManyToOne
    private Test test;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Answer> answers;

    @ManyToOne
    private User user;
}
