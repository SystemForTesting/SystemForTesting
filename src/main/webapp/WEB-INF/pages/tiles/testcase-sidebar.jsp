<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h4><bean:message key="user.sidebar.navigation.test"/></h4>
<c:forEach begin="1" end="30" varStatus="index">
    <div class="col-sm-3">
        <button class="btn btn-primary question-button">
            1
        </button>
    </div>
</c:forEach>

<div class="text-center">
    <button class="btn btn-default finish-test-button">
        <bean:message key="user.button.sidebar.finish.test"/>
    </button>
</div>

