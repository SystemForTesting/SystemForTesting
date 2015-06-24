<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html:form action="/admin/testAddEdit">
    <div class="col-sm-2">
        <bean:message key="test.title"/>
    </div>
    <div class="col-sm-10">
        <html:text property="title" style="width: 100%"/>
    </div>
    <div class="clearfix"></div>
    <br/>

    <div class="col-sm-2">
        <bean:message key="test.pass.mark"/>
    </div>
    <div class="col-sm-10">
        <html:text property="passMark" style="width: 100%"/>
    </div>
    <div class="clearfix"></div>
    <br/>

    <div class="col-sm-2">
        <bean:message key="test.duration"/>
    </div>
    <div class="col-sm-10">
        <html:text property="duration" style="width: 100%"/>
    </div>
    <div class="clearfix"></div>
    <br/>

    <div class="main-quest-panel col-sm-12">
        <div class="questions">
            <nested:iterate property="questions">
                <div class="question-form">
                    <label>Вопрос №</label>

                    <div>
                        <nested:textarea property="title" rows="3" styleClass="form-control vresize">
                        </nested:textarea>
                            <%--<textarea  class="form-control" rows="3"></textarea>--%>
                    </div>
                    <div class="answers">
                        <nested:iterate property="answers">
                            <div class="answer">
                                <div>
                                    <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)"
                                              aria-hidden="true"></span>
                                        </span>
                                        <nested:textarea property="text" rows="3" styleClass="form-control vresize">
                                        </nested:textarea>
                                            <%--<textarea class="form-control" rows="3"></textarea>--%>
                                            <%--<input type="text" class="form-control" aria-label="...">--%>
                                <span class="input-group-addon">
                                    <nested:checkbox property="right">
                                    </nested:checkbox>
                                    <%--<input type="checkbox" aria-label="...">--%>
                                </span>
                                    </div>
                                </div>
                            </div>
                        </nested:iterate>
                    </div>
                    <a onclick="addAnswer(this)" href="javascript:void(0)"
                       class="btn btn-primary btn-raised add-ans-button">Add answer</a>

                    <div class="clearfix"></div>
                </div>
            </nested:iterate>
        </div>
        <div class="text-center">
            <a href="javascript:void(0)" class="btn btn-primary btn-raised add-qwest-button">Add question</a>
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
