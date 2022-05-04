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
	<form:form action='customval4' modelAttribute='dataBean2' method='post'>
		data3: <form:input path='data3' type='text'/><br/>
		<form:errors path='data3'/><br/>
		data4: <form:input path='data4' type='text'/><br/>
		<form:errors path='data4'/><br/>
		<button type='submit'>Submit</button>
	</form:form>
</body>
</html>