package com.epam.testsystem.form;

import com.epam.testsystem.model.Question;
import com.epam.testsystem.model.Test;
import org.apache.struts.action.ActionForm;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TestForm extends ActionForm {
    private Long id;
    private String title;
    private Double passMark;
    private Duration duration;
    private List<Question> questions = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Long getDuration() {
        if (duration == null){
            return null;
        } else {
            return duration.toMinutes();
        }
    }

    public void setDuration(Long duration) {
        this.duration = Duration.ofMinutes(duration);
    }

    public void map(Test test) {
        if (test == null)
            return;

        this.id = test.getId();
        this.title = test.getTitle();
        this.passMark = test.getPassMark();
        this.duration = test.getDuration();
        this.questions = test.getQuestions();
    }

    public void updateTest(Test test) {
        test.setTitle(title);
        test.setPassMark(passMark);
        test.setDuration(duration);
    }
}
