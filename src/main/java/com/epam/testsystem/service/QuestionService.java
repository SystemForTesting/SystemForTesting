package com.epam.testsystem.service;

import com.epam.testsystem.form.TestForm;
import com.epam.testsystem.model.Question;
import com.epam.testsystem.model.Test;
import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.QuestionRepository;
import com.epam.testsystem.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.epam.testsystem.util.SecurityUtils.getCurrentlyAuthenticatedUser;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Transactional
    public Question findById(Long id) {
        Question question = questionRepository.findOne(id);
        return question;
    }

    @Transactional
    public List<Question> findAll() {
        List<Question> all = (List<Question>) questionRepository.findAll();
        return all;
    }

    public void delete(Long id) {
        questionRepository.delete(id);
    }
}
