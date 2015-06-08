package com.epam.testsystem.model;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Test extends BaseEntity {
    // todo check if one value or many ranges or nothing at all
    private String passMark;
    private Duration duration;
    private User creator;
    private Map<Question, List<Answer>> questions;
}
