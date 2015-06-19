package com.epam.testsystem.model;

import com.epam.testsystem.util.LocalDateTimePersistenceConverter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class TestCase extends BaseEntity {
    @Convert(converter = LocalDateTimePersistenceConverter.class)
    private LocalDateTime startedAt;
    @Convert(converter = LocalDateTimePersistenceConverter.class)
    private LocalDateTime dueDate;

    @ManyToOne
    private Test test;

    @ManyToOne
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Answer> answers;
}
