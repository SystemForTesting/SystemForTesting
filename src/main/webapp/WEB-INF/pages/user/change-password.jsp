<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>welcome</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="webjars/bootstrap/3.3.5/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/index.css"/>"/>
</head>
<body>
<nested:form action="/saveNewPassword">
    <div class="span4" id="center">
        <br/><br/>

        <div class="well" align="center">
            <h5>Change Password</h5>

            <div class="control-group">

                <div class="controls">
                    Old<html:text property="user.password"/>
                </div>
            </div>
            <div class="control-group">

                <div class="controls">
                    New<html:text property="newPassword"/>
                </div>
            </div>
            <div class="control-group">

                <div class="controls">
                    Confirm<html:text property="confirmPassword"/>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <html:submit styleClass="btn btn-primary btn-raised add-qwest-button" styleId="savePassword">
                        SAVE
                    </html:submit>
                </div>
            </div>
        </div>
    </div>
    <input class="hidden" type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</nested:form>
</body>
</html>
