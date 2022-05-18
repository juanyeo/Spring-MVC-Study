<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Input Data - MyBatis, MySQL (XML)</h1>
	<form:form action="input_pro" modelAttribute="dataBean" method="post">
		data1 : <form:input path="data1"/><br/>
		data2 : <form:input path="data2"/><br/>
		data3 : <form:input path="data3"/><br/>
		<button type="submit">Submit</button>
	</form:form> 
</body>
</html>