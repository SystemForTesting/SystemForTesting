package com.epam.testsystem.form;

import com.epam.testsystem.model.Test;
import org.apache.struts.action.ActionForm;

import java.time.Duration;

public class TestForm extends ActionForm {
    private Test test = new Test();

    public Long getId() {
        return test.getId();
    }

    public void setId(Long id) {
        test.setId(id);
    }

    public Long getDuration() {
        if (test.getDuration() == null){
            return null;
        } else {
            return test.getDuration().toMinutes();
        }
    }

    public void setDuration(Long duration) {
        test.setDuration(Duration.ofMinutes(duration));
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
