<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:form action="/login">
    <div class="text-center">
        <html:text property="user.username" />
        <html:text property="user.password" />
        <html:submit>
            <bean:message key="body.login.button" />
        </html:submit>
    </div>
</html:form>
