<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Messages</h1>
	<h3>aaa.a1 : <spring:message code="aaa.a1"/></h3>
	<h3>bbb.b3 : <spring:message code="bbb.b3" arguments="${args }"/></h3>
</body>
</html>