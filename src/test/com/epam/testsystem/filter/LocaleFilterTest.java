package com.epam.testsystem.filter;

import org.apache.struts.Globals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LocaleFilterTest {

    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private FilterChain filterChain;

    @Test
    public void testLocaleWhenLanguageNotEqualsNull() throws Exception {
        String locale = "ru";
        request.getSession().setAttribute(Globals.LOCALE_KEY, locale);/*TODO setAttribute*/
        when(request.getParameter("language")).thenReturn(locale);
//        when(request.getSession().getAttribute(Globals.LOCALE_KEY)).thenReturn(locale);
        LocaleFilter localeFilter = new LocaleFilter();
        localeFilter.doFilter(request, response, filterChain);
    }
}