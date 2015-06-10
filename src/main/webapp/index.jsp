<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/skins/markitup/style.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/sets/default/style.css"/>"/>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="style/bootstrap-material-design/dist/css/material-fullpalette.css"/>"/>
          href="<c:url value="style/bootstrap-material-design/dist/css/material.css"/>"/>
          href="<c:url value="style/bootstrap-material-design/dist/css/ripples.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="style/index.css"/>"/>
</head>
<body>

<textarea id="markItUp"></textarea>

<form class="question-form">
    <div class="col-lg-10 question">
        <span class="help-block">Question text</span>
        <br/>
        <textarea class="form-control question-text" rows="3" cols="50" id="textArea"></textarea>
    </div>
    <div class="answer">
        <a href="javascript:void(0)" class="btn btn-primary btn-raised del-ans-button">Delete</a>

        <div class="form-group answer-field">
            <input class="form-control floating-label" id="focusedInput" type="text" placeholder="Write answer">
        </div>
    </div>

    <div class="clear"></div>
    <a href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a>
</form>

<div class="checkbox">
    <label>
        <input type="checkbox"> Notifications
    </label>
</div>
<div class="radio radio-success">
    <label>
        <input type="radio" name="sample1" value="option1" checked="">
        Always
    </label>
</div>

<script src="<c:url value="/webjars/jquery/1.11.3/jquery.min.js"/>"></script>
<script src="<c:url value="markItUp/markitup/jquery.markitup.js"/>"></script>
<script src="<c:url value="markItUp/markitup/sets/default/set.js"/>"></script>
<script src="<c:url value="/js/index.js"/>"></script>
<script src="<c:url value="/style/bootstrap-material-design/dist/js/material.js"/>"></script>
<script src="<c:url value="/style/bootstrap-material-design/dist/js/ripples.js"/>"></script>
</body>
</html>
