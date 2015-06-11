<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h4><bean:message key="admin.sidebar.navigation.test" /></h4>
<ul class="nav nav-pills nav-stacked">
    <li>
        <%--<html:link action="/testList">--%>
        <html:link action="/admin/testView">
            <bean:message key="admin.sidebar.navigation.test.list" />
        </html:link>
    </li>
    <li>
        <html:link action="/admin/testAddEdit">
            <bean:message key="admin.sidebar.navigation.test.add" />
        </html:link>
    </li>
</ul>