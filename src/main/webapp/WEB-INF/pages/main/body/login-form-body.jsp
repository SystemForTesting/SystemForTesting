<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<form role="form" action="<c:url value='/login'/>" method="post">>
    <div class="text-center">
        <input type="text" name="username" />
        <input type="password" name="password" />
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <html:submit>
            <bean:message key="body.login.button" />
        </html:submit>
    </div>
</form>
