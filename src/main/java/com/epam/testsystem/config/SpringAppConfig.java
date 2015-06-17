package com.epam.testsystem.config;

import com.epam.testsystem.action.LoginAction;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = {
        LoginAction.class,
        CustomUserDetailsService.class
})
@Import({SecurityConfig.class, PersistenceConfig.class})
public class SpringAppConfig {
}
