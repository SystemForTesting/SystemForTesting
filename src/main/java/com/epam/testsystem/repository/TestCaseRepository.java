package com.epam.testsystem.repository;

import com.epam.testsystem.model.TestCase;
import org.springframework.data.repository.CrudRepository;

public interface TestCaseRepository extends CrudRepository<TestCase, Long> {

}
