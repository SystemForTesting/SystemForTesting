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
<div>
    <html:submit styleClass="btn btn-primary btn-raised add-qwest-button" styleId="save">
        <%--<bean:message key="admin.sidebar.navigation.student.save"/>--%>
        Change password
    </html:submit>
</div>
</body>
</html>
