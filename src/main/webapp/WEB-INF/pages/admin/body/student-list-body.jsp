<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<tbody>
<logic:iterate name="userListForm" property="users" id="user" indexId="index">
    <tr>
        <td><bean:write name="index"/></td>
        <td><bean:write name="user" property="username"/></td>
    </tr>
</logic:iterate>
</tbody>