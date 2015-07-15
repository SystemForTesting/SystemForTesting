package com.epam.testsystem.spring;

import com.epam.testsystem.filter.LocaleFilter;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

public class SpringWebApplicationInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {SpringAppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {RestConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/"};
    }
}
//        extends AbstractSecurityWebApplicationInitializer {
//
//    public SpringWebApplicationInitializer() {
//        super(SpringAppConfig.class);
//    }
//
//    @Override
//    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
//        FilterRegistration.Dynamic characterEncodingFilter = servletContext.
//                addFilter("encodingFilter", new CharacterEncodingFilter());
//        characterEncodingFilter.setInitParameter("encoding", "UTF-8");
//        characterEncodingFilter.setInitParameter("forceEncoding", "true");
//        characterEncodingFilter.addMappingForUrlPatterns(null, false, "/*");
//
//        FilterRegistration.Dynamic localeFilter = servletContext.
//                addFilter("localeFilter", new LocaleFilter());
//        localeFilter.addMappingForUrlPatterns(null, false, "*.do");
//    }
//}
