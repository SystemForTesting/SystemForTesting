package com.epam.testsystem.rest;

import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tests-users/")
public class UserTestController {

    @Autowired
    TestCaseService testCaseService;

    @RequestMapping(value = "/.rest", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody Map<Long, Long> getTestsUsers() {
//        @PathVariable String name, ModelMap model

        List<TestCase> testCases = testCaseService.findAll();
        Map<Long, Long> users_tests = new HashMap<>();

        for (TestCase testCase : testCases) {
            users_tests.put(testCase.getUser().getId(), testCase.getTest().getId());
        }

        return users_tests;
    }
}
