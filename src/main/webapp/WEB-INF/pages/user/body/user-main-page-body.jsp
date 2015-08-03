<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<div class="col-lg-6 width-73-perc padding-5px">
    <div class="bs-example bs-example-tabs" data-example-id="togglable-tabs">
        <ul id="myTabs" class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab"
                                                      aria-controls="home" aria-expanded="false">
                <bean:message key="not.completed.tests"/>
            </a></li>
            <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab"
                                       aria-controls="profile" aria-expanded="true">
                <bean:message key="completed.tests"/>
            </a>
            </li>
        </ul>
        <nested:form action="/index">
            <div id="myTabContent" class="tab-content">
                <div role="tabpanel" class="tab-pane fade" id="home" aria-labelledby="home-tab">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>Тест</th>
                            <th>Ссылка на тест</th>
                        </tr>
                        </thead>
                        <nested:iterate property="testCaseForms" id="testCaseForm" >
                            <c:set var="startedTime">
                                <nested:write property="startedAt"/>
                            </c:set>
                            <c:if test="${startedTime eq ''}">
                                <tr>
                                    <td><nested:write property="testForm.test.title"/></td>
                                    <td><a href="">Ссылка на тест, можно сделать обычную ссылку, но с проверкой на наличие в сессии соответствующего юзера</a></td>
                                </tr>
                            </c:if>
                        </nested:iterate>
                    </table>
                </div>
                <div role="tabpanel" class="tab-pane fade active in" id="profile" aria-labelledby="profile-tab">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>Тест</th>
                            <th>Результат</th>
                        </tr>
                        </thead>
                        <nested:iterate property="testCaseForms" id="testCaseForm" >
                            <c:set var="startedTime">
                                <nested:write property="startedAt"/>
                            </c:set>
                            <c:if test="${startedTime ne ''}">
                                <tr>
                                    <td><nested:write property="testForm.test.title"/></td>
                                    <td><a href="">100%, при клике на строку переносим на страницу содержащую всю инфу по тесту.</a></td>
                                </tr>
                            </c:if>
                        </nested:iterate>
                    </table>
                </div>
            </div>
        </nested:form>
    </div>
</div>
