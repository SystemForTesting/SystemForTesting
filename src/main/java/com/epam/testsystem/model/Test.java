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

    @ManyToOne
    private User createdBy;

    @ManyToOne
    private User updatedBy;

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

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User creator) {
        this.createdBy = creator;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }
}
