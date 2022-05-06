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
	<form:form action="validation2" modelAttribute="dataBean1" method="post">
		
		data1 : <form:input path="data1"/><br/>
				<form:errors path="data1"/><br/>
				
		data2 : <form:input path="data2"/><br/>
				<form:errors path="data2"/><br/>
				
		data3 : <form:input path="data3"/><br/>
				<form:errors path="data3"/><br/>
	
		<form:button type="submit">submit</form:button>
	</form:form>
</body>
</html>