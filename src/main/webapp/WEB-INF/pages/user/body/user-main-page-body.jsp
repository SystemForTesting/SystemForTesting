<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="htmL" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-lg-6 width-25-perc padding-5px">
    <div class="container-fluid">
        <div><label><bean:message key="user.username"/>:</label>

            <div>${user.username}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.first.name"/>:</label>

            <div>${user.firstName}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.last.name"/>:</label>

            <div>${user.lastName}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.email"/>:</label>

            <div>${user.email}</div>
        </div>
    </div>
    <br/>

    <div>
        <nested:form action="/changePassword">
            <div align="center">
                <html:submit styleClass="btn btn-primary btn-raised add-qwest-button" styleId="save">
                    <bean:message key="change.password"/>
                </html:submit>
                <html:hidden property="user.password"/>
            </div>
            <input class="hidden" type="hidden"
                   name="${_csrf.parameterName}"
                   value="${_csrf.token}"/>
        </nested:form>
    </div>
</div>
<div class="col-lg-6 width-73-perc padding-5px">
    <div class="bs-example bs-example-tabs" data-example-id="togglable-tabs">
        <ul id="myTabs" class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab"
                                                      aria-controls="home" aria-expanded="false">
                <bean:message key="not.completed.tests"/>
            </a></li>
            <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab"
                                       aria-controls="profile" aria-expanded="true">
                <bean:message key="completed.tests"/>
            </a>
            </li>
        </ul>
        <nested:form action="/test">
            <div id="myTabContent" class="tab-content">
                <div role="tabpanel" class="tab-pane fade active in" id="home" aria-labelledby="home-tab">
                    <p>
                        <nested:iterate name="testCaseForm" property="notCompletedTestCases" id="notCompletedTestCase"
                                        indexId="index">
                            <a><bean:write name="notCompletedTestCase" property="test.title"/></a>
                        </nested:iterate>
                    </p>
                </div>
                <div role="tabpanel" class="tab-pane fade active in" id="profile" aria-labelledby="profile-tab">
                    <p><nested:iterate name="testCaseForm" property="completedTestCases" id="completedTestCase"
                                       indexId="index">
                        <bean:write name="completedTestCase" property="test.title"/>
                    </nested:iterate>
                    </p>
                </div>
            </div>
        </nested:form>
    </div>
</div>
