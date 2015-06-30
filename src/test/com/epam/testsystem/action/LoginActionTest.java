package com.epam.testsystem.action;

import servletunit.struts.MockStrutsTestCase;

public class LoginActionTest extends MockStrutsTestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testLoginSuccessful() throws Exception {
        setServletConfigFile("/WEB-INF/web.xml");
        setConfigFile("/WEB-INF/struts-config.xml");
        setConfigFile("/WEB-INF/tiles-defs.xml");
        setRequestPathInfo("/login.do");
        actionPerform();
        verifyForward("success");
    }
}