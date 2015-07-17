<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nested:form action="/admin/userAddEdit">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>#</th>
            <th><bean:message key="user.username"/></th>
            <th><bean:message key="user.first.name"/></th>
            <th><bean:message key="user.last.name"/></th>
            <th><bean:message key="user.email"/></th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate name="userListForm" property="users" id="user" indexId="index">
            <tr>
                <td><bean:write name="index"/></td>
                <td><bean:write name="user" property="username"/></td>
                <td><bean:write name="user" property="firstName"/></td>
                <td><bean:write name="user" property="lastName"/></td>
                <td><bean:write name="user" property="email"/></td>
                <c:set var="id">
                    <bean:write name="user" property="id"/>
                </c:set>
                <td><a class="btn btn-danger btn-raised add-qwest-button"
                       href="<c:url value="/admin/removeUser.do?id=${id}" />">X</a>
                </td>
            </tr>
        </logic:iterate>
        <tr id="createUserInputsId">
            <td></td>
            <td><html:text property="user.username" size="20"/></td>
            <td><html:text property="user.firstName"/></td>
            <td><html:text property="user.lastName"/></td>
            <td><html:text property="user.email"/></td>
        </tr>
        </tbody>
    </table>
    <div align="center">
        <a class="btn btn-primary btn-raised add-qwest-button" onclick="createCancelStudent()" id="createButton">
            <bean:message key="admin.sidebar.navigation.student.add"/>
        </a>
        <html:submit styleClass="btn btn-primary btn-raised add-qwest-button" styleId="save">
            <bean:message key="admin.sidebar.navigation.student.save"/>
        </html:submit>
        <a class="btn btn-default btn-raised add-qwest-button" onclick="createCancelStudent()" id="cancel">
            <bean:message key="admin.sidebar.navigation.student.cancel"/>
        </a>
    </div>
    <input class="hidden" type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <font color="red">
        <html:errors/>
    </font>
</nested:form>

