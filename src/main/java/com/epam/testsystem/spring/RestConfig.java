package com.epam.testsystem.spring;

import com.epam.testsystem.rest.UserTestController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = UserTestController.class)
public class RestConfig {
}