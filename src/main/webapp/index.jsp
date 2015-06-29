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

<div class="questions">
    <c:forEach begin="1" end="30" varStatus="index">
        <button class="question-button btn btn-primary">
                ${index}
        </button>
    </c:forEach>
</div>

<div class="questions col-sm-4">
    <c:forEach begin="1" end="30" varStatus="index">
        <div class="col-sm-3" style="float: left">
            <button class="btn btn-primary">
                    ${index}
            </button>
        </div>
    </c:forEach>
</div>

<div class="questions-two">
    <c:forEach begin="1" end="30" varStatus="index">
        <button class="question-button-two btn btn-primary">
                ${index}
        </button>
    </c:forEach>
</div>



<script src="<c:url value="/webjars/jquery/2.1.4/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/index.js"/>"></script>
<script src="<c:url value="/webjars/bootstrap/3.3.5/js/bootstrap.js"/>"></script>
</body>
</html>
