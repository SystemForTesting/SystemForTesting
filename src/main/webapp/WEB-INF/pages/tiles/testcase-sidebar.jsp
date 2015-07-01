<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h4><bean:message key="user.sidebar.navigation.test"/></h4>
<c:forEach begin="1" end="30" varStatus="loop">
    <div class="col-sm-3">
        <button onclick="selectQuestion(this)" id="${loop.index}" class="btn btn-default question-button <c:if test="${loop.index < 2}">current</c:if>">
            ${loop.index}
        </button>
    </div>
</c:forEach>

<%--<nested:iterate property="questions" indexId="index">--%>
    <%--<button class="btn btn-default question-button">--%>
        <%--<bean:write name="index"/>--%>
    <%--</button>--%>
<%--</nested:iterate>--%>

<div class="text-center">
    <button class="btn btn-default finish-test-button">
        <bean:message key="user.button.sidebar.finish.test"/>
    </button>
</div>

