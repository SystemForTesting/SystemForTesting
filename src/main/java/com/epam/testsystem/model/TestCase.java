package com.epam.testsystem.model;

import java.time.LocalDateTime;
import java.util.List;

public class TestCase extends BaseEntity {
    private LocalDateTime startedAt;
    private Test test;
    private List<Answer> answers;
}
