<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<div class="col-lg-6 width-25-perc padding-5px">
    <div class="container-fluid">
        <div><label><bean:message key="user.username"/>:</label>

            <div>${user.username}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.first.name"/>:</label>

            <div>${user.firstName}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.last.name"/>:</label>

            <div>${user.lastName}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.email"/>:</label>

            <div>${user.email}</div>
        </div>
    </div>
    <br/>

    <div>
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
    </div>
</div>
<div class="col-lg-6 width-75-perc padding-5px">
</div>
