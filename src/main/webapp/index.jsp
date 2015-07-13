<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="webjars/bootstrap/3.3.5/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/index.css"/>"/>
</head>
<body>

<div class="main">
    <div class="panel panel-default front-panel">
        <span class="slide-in-out-button" onclick="slidePanel.doSlide(this)">
            <div class="arrow-right"></div>
        </span>
        <input type="text" class="form-control search-row" aria-label="">
        <div class="panel panel-default admin-test-list">
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
            <div><input type="radio" name="tests"> Test1</div>
        </div>
    </div>

    <div class="panel panel-default back-panel">
        <table class="table stud-table">
            <thead>
                <tr>
                    <td>Student</td>
                    <td>Link to test</td>
                </tr>
            </thead>
            <tr>
                <td class="stud-td">
                    <div class="panel panel-primary stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">Smith</div>
                    <div class="stud-cell">Smith</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
            <tr>
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">Johnson</div>
                    <div class="stud-cell">Smith</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
            <tr>
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">White</div>
                    <div class="stud-cell">Smith</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
            <tr>
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">Scott</div>
                    <div class="stud-cell">Smith</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
        </table>
    </div>
</div>

<script src="<c:url value="/webjars/jquery/2.1.4/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/indexx.js"/>"></script>
<script src="<c:url value="/webjars/bootstrap/3.3.5/js/bootstrap.js"/>"></script>
</body>
</html>
