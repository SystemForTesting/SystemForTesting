<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/skins/markitup/style.css"/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value="markItUp/markitup/sets/default/style.css"/>" />
</head>
<body>

<textarea id="markItUp"></textarea>

<script src="<c:url value="/webjars/jquery/1.11.3/jquery.min.js"/>"></script>
<script src="<c:url value="markItUp/markitup/jquery.markitup.js"/>"></script>
<script src="<c:url value="markItUp/markitup/sets/default/set.js"/>"></script>
<script src="<c:url value="/index.js"/>"></script>
</body>
</html>
