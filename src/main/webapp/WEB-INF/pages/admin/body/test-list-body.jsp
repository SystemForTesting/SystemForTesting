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
            <th><bean:message key="test.title" /> </th>
            <th><bean:message key="test.pass.mark"/> </th>
            <th><bean:message key="test.duration"/> </th>
        </tr>
    </thead>
    <tbody>
    <logic:iterate name="testListForm" property="tests" id="test" indexId="index">
        <tr>
            <td><bean:write name="index"/></td>
            <td><bean:write name="test" property="title"/></td>
            <td><bean:write name="test" property="passMark"/></td>
            <td><bean:write name="test" property="duration"/></td>
        </tr>
    </logic:iterate>
    </tbody>
</table>
