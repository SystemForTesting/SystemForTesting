<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

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
        </tr>
    </logic:iterate>
    <tr id="createUserInputsId">
        <html:form action="/admin/userAddEdit">
            <td></td>
            <td><html:text property="username"/></td>
            <td><html:text property="firstName"/></td>
            <td><html:text property="lastName"/></td>
            <td><html:text property="email"/></td>
        </html:form>
    </tr>
    </tbody>
</table>
<div align="center">
    <a class="btn btn-primary btn-raised add-qwest-button" onclick="createCancelStudent()" id="createButton">
        <bean:message key="admin.sidebar.navigation.student.add"/>
    </a>
    <a class="btn btn-primary btn-raised add-qwest-button" id="save">
        <bean:message key="admin.sidebar.navigation.student.save"/>
    </a>
    <a class="btn btn-default btn-raised add-qwest-button" onclick="createCancelStudent()" id="cancel">
        <bean:message key="admin.sidebar.navigation.student.cancel"/>
    </a>
</div>
