<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
    <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<c:url value="http://www.google.com" var="url"/>
<spring:url value="http://www.google.com" htmlEscape="true" var="springUrl" />
Spring URL: ${springUrl} at ${time}
<br>
JSTL URL: ${url}
<br>
Message: ${message}<br/>
<img src="images/Spring-Boot-Logo.png" style="width:50px; height:50px"/>
</body>
<script src="js/jquery-1.11.3.js" type="text/javascript"></script>
</html>






