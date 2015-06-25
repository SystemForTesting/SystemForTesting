package com.epam.testsystem.repository;

import com.epam.testsystem.model.Question;

public interface QuestionRepository extends BaseRepository<Question> {
    Question findByTitle(String title);
}
