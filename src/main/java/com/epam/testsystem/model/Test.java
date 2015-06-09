package com.epam.testsystem.model;

import java.time.Duration;
import java.util.List;

public class Test extends BaseEntity {
    // todo check if one value or many ranges or nothing at all
    private String passMark;
    private Duration duration;
    private DBUser creator;
    private List<Question> questions;
}
