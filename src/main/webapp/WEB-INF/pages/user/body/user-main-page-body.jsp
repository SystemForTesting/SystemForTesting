<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

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
