package com.epam.testsystem.form;

import com.epam.testsystem.model.Answer;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.TestCase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestCaseForm extends BaseForm<TestCase> {
    private TestForm testForm = new TestForm();
    private List<Answer> answers = new ArrayList<>();
    private LocalDateTime startedAt;

    public TestCaseForm() {
    }

    public TestCaseForm(TestCase testCase) {
        this.testForm = new TestForm(testCase.getTest());
        this.answers = testCase.getAnswers();
        this.startedAt = testCase.getStartedAt();
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

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
