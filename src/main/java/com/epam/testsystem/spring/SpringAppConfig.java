package com.epam.testsystem.spring;

import com.epam.testsystem.action.LoginAction;
import com.epam.testsystem.security.SecurityConfig;
import com.epam.testsystem.service.TestService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = {
        LoginAction.class,
        TestService.class
})
@Import({SecurityConfig.class, PersistenceConfig.class})
public class SpringAppConfig {
}
