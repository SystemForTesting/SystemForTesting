<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<button onclick="addMissed()">add missed</button>
<button onclick="addAnswered()">add answered</button>
<html:form action="/test">
    <nested:iterate property="questions">
        <div class="question">
            <div class="quest-text text-center panel panel-default">
                <nested:write property="title"/>
            </div>
            <c:set var="isMultiple">
                <nested:write property="multipleAnswers"/>
            </c:set>

            ${isMultiple}
            <div class="answers">
                <nested:iterate property="answers">

                    <c:if test="${isMultiple eq 0}">
                        <nested:radio property="answers[0]" value="text"/><nested:write property="text"/>
                    </c:if>
                    <c:if test="${isMultiple eq 1}">
                        <nested:checkbox property="answers[0]" value="text"/><nested:write property="text"/>
                    </c:if>

                </nested:iterate>
            </div>
        </div>
    </nested:iterate>
</html:form>

<nav>
    <ul class="pager">
        <li><a href="#" onclick="switchQuestionToPrevious()"><span class="glyphicon glyphicon-menu-left"></span></a>
        </li>
        <li><a href="#" onclick="switchQuestionToNext()"><span class="glyphicon glyphicon-menu-right"></span></a></li>
    </ul>
</nav>