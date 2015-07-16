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
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/3.3.5/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/static/css/style.css' />" />
</head>
<body>
<nested:form action="/saveNewPassword">
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <div class="account-wall">
                    <br/>
                    <h5 align="center">Change Password</h5>
                    <br/>
                    <div class="text-center">
                            Old<html:text property="user.password"/><br/>
                            New<html:text property="newPassword"/><br/>
                            Confirm<html:text property="confirmPassword"/><br/>
                            <html:submit styleClass="btn btn-primary btn-raised add-qwest-button"
                                         styleId="savePassword">
                                SAVE
                            </html:submit>
                        </div>
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
