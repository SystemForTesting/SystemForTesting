package com.epam.testsystem.spring;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    public SpringWebApplicationInitializer() {
        super(SpringAppConfig.class);
    }
}
