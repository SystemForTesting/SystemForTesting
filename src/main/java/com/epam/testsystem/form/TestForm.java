package com.epam.testsystem.form;

import com.epam.testsystem.model.Answer;
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
    private List<Question> questions = new StrutsArrayList<Question>(Question.class) {
        @Override
        protected Question elementToAdd() {
            return new Question() {
                @Override
                public List<Answer> getAnswers() {
                    if(super.getAnswers() == null)
                        super.setAnswers(new StrutsArrayList<>(Answer.class));
                    return super.getAnswers();
                }
            };
        }
    };

//            new ArrayList<Question>() {
//        @Override
//        public Question get(int index) {
//            if(this.size() <= index)
//                this.add(new Question() {
//                    @Override
//                    public List<Answer> getAnswers() {
//                        if(super.getAnswers() == null)
//                            setAnswers(new ArrayList<Answer>() {
//                                @Override
//                                public Answer get(int index) {
//                                    if(this.size() <= index) {
//                                        this.add(new Answer());
//                                        this.add(new Answer());
//                                    }
//                                    return super.get(index);
//                                }
//                            });
//                        return super.getAnswers();
//                    }
//                });
//            return super.get(index);
//        }
//    };

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
