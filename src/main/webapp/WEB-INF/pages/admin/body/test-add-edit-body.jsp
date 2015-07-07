<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html:form action="/admin/testAddEdit">
    <div class="form-inline col-sm-4 text-center form-group">
        <label><bean:message key="test.title"/></label>
        <html:text property="title" style="width: 100%;" styleClass="form-control"/>
    </div>

    <div class="form-inline col-sm-4 text-center form-group">
        <label><bean:message key="test.pass.mark"/></label>
        <html:text property="passMark" style="width: 100%;" styleClass="form-control"/>
    </div>

    <div class="form-inline col-sm-4 text-center form-group">
        <label><bean:message key="test.duration"/></label>
        <html:text property="duration" style="width: 100%;" styleClass="form-control"/>
    </div>

    <div class="main-quest-panel col-sm-12">
        <div class="questions">
            <nested:iterate property="questions" indexId="qindex">
                <nested:text property="id" readonly="true" styleClass="hidden"/>
                <c:set var="aIndex">
                    <bean:write name="qindex"/>
                </c:set>
                <div class="question-form" id="${aIndex}">
                    <label><bean:message key="question"/> ${aIndex + 1}</label>

                    <div>
                        <nested:textarea property="title" rows="3" styleClass="form-control vresize">
                        </nested:textarea>
                            <%--<textarea  class="form-control" rows="3"></textarea>--%>
                    </div>
                    <div class="answers">
                        <nested:iterate property="answers">
                            <nested:text property="id" readonly="true" styleClass="hidden"/>
                            <div class="answer">
                                <div>
                                    <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)"
                                              aria-hidden="true"></span>
                                        </span>
                                        <nested:textarea property="text" rows="3" styleClass="form-control vresize">
                                        </nested:textarea>
                                <span class="input-group-addon">
                                    <nested:checkbox property="right">
                                    </nested:checkbox>
                                </span>
                                    </div>
                                </div>
                            </div>
                        </nested:iterate>
                    </div>
                    <a onclick="addAnswer(this)" href="javascript:void(0)"
                       class="btn btn-primary btn-raised add-ans-button"><bean:message key="button.add.answer"/></a>

                    <div class="clearfix"></div>
                </div>
            </nested:iterate>
        </div>
        <div class="text-center">
            <a href="javascript:void(0)" class="btn btn-primary btn-raised add-qwest-button"><bean:message
                    key="button.add.question"/></a>
        </div>
    </div>

    <div class="text-center">
        <html:text property="id" readonly="true" styleClass="hidden"/>
        <input class="hidden" type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <html:submit>
            <bean:message key="button.save"/>
        </html:submit>
    </div>
</html:form>
