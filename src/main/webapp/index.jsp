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

        <form>
            <div class="panel panel-default admin-test-list">
                <div><input id="test1" type="radio" name="tests"> Test1</div>
                <div><input id="test2" type="radio" name="tests"> Test2</div>
                <div><input id="test3" type="radio" name="tests"> Test3</div>
                <div><input id="test4" type="radio" name="tests"> Test4</div>
                <div><input id="test5" type="radio" name="tests"> Test5</div>
                <div><input id="test6" type="radio" name="tests"> Test6</div>
                <div><input id="test7" type="radio" name="tests"> Test7</div>
                <div><input id="test8" type="radio" name="tests"> Test8</div>
                <div><input id="test9" type="radio" name="tests"> Test9</div>
                <div><input id="test10" type="radio" name="tests"> Test10</div>
            </div>
            <buton>Apply</buton>
        </form>
    </div>

    <div class="panel panel-default back-panel">
        <table class="table stud-table">
            <thead>
            <tr>
                <td>Student</td>
                <td>Link to test</td>
            </tr>
            </thead>
            <tr id="1">
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel">
                        <div>
                            <div class="role">Student</div>
                        </div>
                        <div><label>Name:</label>

                            <div>John</div>
                        </div>
                        <div><label>Surname:</label>

                            <div>Smith</div>
                        </div>
                        <div><label>E-mail:</label>

                            <div>mrmemberstar@gmail.com</div>
                        </div>
                    </div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">Smith.J</div>
                    <div class="stud-cell">Smith.J</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
            <tr id="2">
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">Johnson</div>
                    <div class="stud-cell">Johnson</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
            <tr>
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">White</div>
                    <div class="stud-cell">White</div>
                </td>
                <td onmouseover="hoverTestLink(this)"></td>
            </tr>
            <tr id="3">
                <td class="stud-td">
                    <div class="stud-wide-info-drop-panel"></div>
                    <div class="stud-wide-info" onclick="widePanel.doExpand(this)">Scott</div>
                    <div class="stud-cell">Scott</div>
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
