package com.epam.testsystem.model;

import com.epam.testsystem.util.DurationToStringConverter;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Entity
public class Test extends BaseEntity {
    private String title;
    private Double passMark;

    @Convert(converter = DurationToStringConverter.class)
    private Duration duration;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Question> questions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPassMark() {
        return passMark;
    }

    public void setPassMark(Double passMark) {
        this.passMark = passMark;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
