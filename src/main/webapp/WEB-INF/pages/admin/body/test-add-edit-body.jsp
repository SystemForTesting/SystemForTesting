<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="text-center text-danger">
    <c:if test="${not empty param.error}">
        <bean:message key="error.wrong.username.password" />
    </c:if>
</div>
<html:form action="/admin/testAddEdit">
    <div class="col-sm-2">
        <bean:message key="test.title" />
    </div>
    <div class="col-sm-10">
        <html:text property="test.title" style="width: 100%" />
    </div>
    <div class="clearfix"></div>
    <br />

    <div class="col-sm-2">
        <bean:message key="test.pass.mark" />
    </div>
    <div class="col-sm-10">
        <html:text property="test.passMark" style="width: 100%" />
    </div>
    <div class="clearfix"></div>
    <br />

    <div class="col-sm-2">
        <bean:message key="test.duration" />
    </div>
    <div class="col-sm-10">
        <html:text property="duration" style="width: 100%" />
    </div>
    <div class="clearfix"></div>
    <br />
    <div class="text-center">
        <html:text property="id" readonly="true" styleClass="hidden" />
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <html:submit>
            <bean:message key="button.save" />
        </html:submit>
    </div>
</html:form>
