package com.epam.testsystem.form;

import com.epam.testsystem.model.Test;
import org.apache.struts.action.ActionForm;

import java.util.ArrayList;
import java.util.List;

public class TestListForm extends ActionForm {
    private List<Test> tests = new ArrayList<>();

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
