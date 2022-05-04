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
	<form:form action='jsr303' modelAttribute='dataBean3' method='post'>
		data5: <form:radiobutton path='data5' value='true'/>true
			   <form:radiobutton path='data5' value='false'/>false<br/>
		<form:errors path='data5'/><br/>
		data6: <form:radiobutton path='data6' value='true'/>true
			   <form:radiobutton path='data6' value='false'/>false<br/>
		<form:errors path='data6'/><br/>
		data7: <form:input path='data7' type='text'/><br/>
		<form:errors path='data7'/><br/>
		data8: <form:input path='data8' type='text'/><br/>
		<form:errors path='data8'/><br/>
		data9: <form:checkbox path='data9' value='check1'/>checkbox1<br/>
		<form:errors path='data9'/><br/>
		data10: <form:input path='data10' type='text'/><br/>
		<form:errors path='data10'/><br/>
		
		<button type='submit'>Submit</button>
	</form:form>
</body>
</html>