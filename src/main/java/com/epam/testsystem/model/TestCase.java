package com.epam.testsystem.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class TestCase extends BaseEntity {
    private LocalDateTime startedAt;
    private Test test;
    private Map<Question, List<Answer>> answers;
}
