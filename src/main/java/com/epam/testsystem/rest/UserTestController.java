package com.epam.testsystem.rest;

import com.epam.testsystem.dto.UserTestDto;
import com.epam.testsystem.dto.UserTestsDto;
import com.epam.testsystem.model.TestCase;
import com.epam.testsystem.model.User;
import com.epam.testsystem.service.TestCaseService;
import com.epam.testsystem.service.TestService;
import com.epam.testsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tests-users/")
public class UserTestController {

    @Autowired
    TestCaseService testCaseService;

    @Autowired
    UserService userService;

    @Autowired
    TestService testService;

    @RequestMapping(value = "/.rest", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody List<UserTestDto> getTestsUsers() {
//        @PathVariable String name, ModelMap model

        List<TestCase> testCases = testCaseService.findAll();
        List<UserTestDto> users_tests = new ArrayList<>();

        for (TestCase testCase : testCases) {
            users_tests.add(new UserTestDto(testCase.getUser().getId(), testCase.getTest().getId()));
        }//todo list insted map, cause map can't store equal key

        return users_tests;
    }

    @RequestMapping(value = "/sendTest/.rest", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody
    ResponseEntity<UserTestsDto> sendTestData() {

        UserTestsDto userTestsDto = new UserTestsDto();
        userTestsDto.setUserId("45");
        List<String> testsIds = new ArrayList<>();
        testsIds.add("34");
        testsIds.add("42");
        testsIds.add("56");
        userTestsDto.setTestIds(testsIds);

        return new ResponseEntity<UserTestsDto>(userTestsDto, HttpStatus.OK);
    }

    @RequestMapping(value = "/setUserTests/.rest", method = RequestMethod.POST)
    public void setUserTests(@RequestBody UserTestsDto userTestsDto) {

        User user = userService.findById((long) Integer.parseInt(userTestsDto.getUserId()));

        for (String testId : userTestsDto.getTestIds()) {
            TestCase testCase = new TestCase();
            testCase.setUser(user);
            testCase.setTest(testService.findById((long) Integer.parseInt(testId)));
            testCase.setCreatedAt(LocalDateTime.now());
            testCase.setCreatedBy(user);

            testCaseService.save(testCase);
        }
    }
}
