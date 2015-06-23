package com.epam.testsystem.spring;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

public class SpringWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    public SpringWebApplicationInitializer() {
        super(SpringAppConfig.class);
    }

    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
        FilterRegistration.Dynamic characterEncodingFilter = servletContext.
                addFilter("encodingFilter", new CharacterEncodingFilter());
        characterEncodingFilter.setInitParameter("encoding", "UTF-8");
        characterEncodingFilter.setInitParameter("forceEncoding", "true");
        characterEncodingFilter.addMappingForUrlPatterns(null, false, "/*");
    }
}
