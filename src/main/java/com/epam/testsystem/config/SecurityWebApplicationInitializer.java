package com.epam.testsystem.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(
//                ActionConfig.class,
//                PersistenceConfig.class,
                SecurityConfig.class
        );
    }
}
