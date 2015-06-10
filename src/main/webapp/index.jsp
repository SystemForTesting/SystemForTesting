<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/skins/markitup/style.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/sets/default/style.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="style/bootstrap-material-design/dist/css/material-fullpalette.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="style/index.css"/>"/>
</head>
<body>

<textarea id="markItUp"></textarea>

<form class="question-form">
    <div class="col-lg-10 question">
        <textarea class="form-control" rows="3" id="textArea"></textarea>
        <span class="help-block">Help Block</span>
        <a href="javascript:void(0)" class="btn btn-primary btn-raised">Add answer</a>
    </div>
    <div class="answer">
        <a href="javascript:void(0)" class="btn btn-primary btn-raised">Delete</a>
        <div class="form-group">
            <input class="form-control floating-label" id="focusedInput" type="text" placeholder="Write something to make the label float">
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox"> delete
            </label>
        </div>
    </div>
</form>

<script src="<c:url value="/webjars/jquery/1.11.3/jquery.min.js"/>"></script>
<script src="<c:url value="markItUp/markitup/jquery.markitup.js"/>"></script>
<script src="<c:url value="markItUp/markitup/sets/default/set.js"/>"></script>
<script src="<c:url value="/js/index.js"/>"></script>
<script src="<c:url value="/style/bootstrap-material-design/dist/js/material.js"/>"></script>
</body>
</html>
