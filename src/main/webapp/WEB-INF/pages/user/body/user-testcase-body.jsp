<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<button onclick="addMissed()">add missed</button>
<button onclick="addAnswered()">add answered</button>

<%--<div class="custom-btn-block">--%>
    <%--<label for="ans-btn" class="button">--%>
        <%--<span>A</span>--%>
    <%--</label>--%>
    <%--<input onclick="selectAnswer()" id="ans-btn" type="checkbox">--%>
<%--</div>--%>

<html:form action="/test">
    <nested:iterate property="questions">
        <div class="question">
            <div class="quest-text text-center panel panel-default">
                <nested:write property="title"/>
            </div>
            <c:set var="isMultiple">
                <nested:write property="multipleAnswers"/>
            </c:set>

            <div class="answers">
                <nested:iterate property="answers" indexId="index">

                    <c:set var="currentIndex">
                        <bean:write name="index"/>
                    </c:set>
                    <div>
                        <c:if test="${isMultiple eq 0}">
                            <div class="custom-btn-block">
                                <label for="ans-btn${currentIndex}" class="button">
                                    <span>A</span>
                                </label>
                                <input name="answers" onclick="selectAnswer()" id="ans-btn${currentIndex}" type="radio"><nested:write property="text"/>
                            </div>
                            <%--<input type="radio" name="answers[${currentIndex}]"><nested:write property="text"/>--%>
                            <%--<nested:radio name="answers[${currentIndex}]" property="" value="text"/><nested:write property="text"/>--%>
                        </c:if>
                        <c:if test="${isMultiple eq 1}">
                            <div class="custom-btn-block">
                                <label for="ans-btn${currentIndex}" class="button">
                                    <span>A</span>
                                </label>
                                <input name="answers[${currentIndex}]" onclick="selectAnswer()" id="ans-btn${currentIndex}" type="checkbox"><nested:write property="text"/>
                            </div>
                            <%--<input type="checkbox" name="answers[${currentIndex}]"><nested:write property="text"/>--%>
                            <%--<nested:checkbox property="answers" value="text"/><nested:write property="text"/>--%>
                        </c:if>
                    </div>

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