package com.epam.testsystem.form;

import com.epam.testsystem.model.Answer;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.TestCase;

import java.util.ArrayList;
import java.util.List;

public class TestCaseForm extends BaseForm<TestCase> {
    private TestForm testForm = new TestForm();
    private List<Answer> answers = new ArrayList<>();

    public TestForm getTestForm() {
        return testForm;
    }

    public List<QuestionForm> getQuestions() {
        return this.testForm.getQuestions();
    }

    public void setTestForm(TestForm testForm) {
        this.testForm = testForm;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {


        this.answers = answers;
    }

    @Override
    public void map(TestCase testCase) {
        Test test = testCase.getTest();
        TestForm testForm = new TestForm();
        testForm.map(test);
        this.testForm = testForm;
    }

    @Override
    public void update(TestCase testCase) {

    }
}
