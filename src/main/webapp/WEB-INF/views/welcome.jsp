<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
<c:url value="http://www.google.com" var="url"/>
<spring:url value="http://www.google.com" htmlEscape="true" var="springUrl" />
Spring URL: ${springUrl} at ${time}
<br>
JSTL URL: ${url}
<br>
Message: ${message}<br/>
</body>
</html>






