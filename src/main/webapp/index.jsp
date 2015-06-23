<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/skins/markitup/style.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/sets/default/style.css"/>"/>
    <%--<link rel="stylesheet" type="text/css"--%>
    <%--href="<c:url value="style/bootstrap-material-design/dist/css/material-fullpalette.css"/>"/>--%>
    <%--<link rel="stylesheet" type="text/css"--%>
    <%--href="<c:url value="style/bootstrap-material-design/dist/css/material.css"/>"/>--%>
    <%--<link rel="stylesheet" type="text/css"--%>
    <%--href="<c:url value="style/bootstrap-material-design/dist/css/ripples.css"/>"/>--%>
    <link rel="stylesheet" type="text/css" href="<c:url value="webjars/bootstrap/3.3.5/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="style/index.css"/>"/>
</head>
<body>

<textarea id="markItUp"></textarea>

<form class="question-form">
    <div>
        <textarea class="form-control" rows="3"></textarea>
    </div>
    <div class="answers">
        <div class="answer">
            <div class="col-lg-10">
                <div class="input-group">
                        <span class="input-group-addon">
                             <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                        </span>
                    <input type="text" class="form-control" aria-label="...">
                        <span class="input-group-addon">
                            <input type="checkbox" aria-label="...">
                        </span>
                </div>
            </div>
        </div>
    </div>
    <div class="clear"></div>
    <a href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a>
</form>

<script src="<c:url value="/webjars/jquery/2.1.4/jquery.min.js"/>"></script>
<script src="<c:url value="markItUp/markitup/jquery.markitup.js"/>"></script>
<script src="<c:url value="markItUp/markitup/sets/default/set.js"/>"></script>
<script src="<c:url value="/js/index.js"/>"></script>
<%--<script src="<c:url value="/style/bootstrap-material-design/dist/js/material.js"/>"></script>--%>
<%--<script src="<c:url value="/style/bootstrap-material-design/dist/js/ripples.js"/>"></script>--%>
<script src="<c:url value="/webjars/bootstrap/3.3.5/js/bootstrap.js"/>"></script>
</body>
</html>
