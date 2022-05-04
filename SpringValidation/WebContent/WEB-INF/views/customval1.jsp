<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='customval2' method='post'>
		data3: <input type='text' name='data3'/><br/>
		<spring:hasBindErrors name='dataBean2'>
			<c:if test='${errors.hasFieldErrors("data3") }'>
				<spring:message code="${errors.getFieldError('data3').codes[0]}"/><br/>
			</c:if>
		</spring:hasBindErrors>
		data4: <input type='text' name='data4'/><br/>
		<spring:hasBindErrors name='dataBean2'>
			<c:if test='${errors.hasFieldErrors("data4") }'>
				<spring:message code="${errors.getFieldError('data4').codes[0]}"/><br/>
			</c:if>
		</spring:hasBindErrors>
		<button type='submit'>Submit</button>
	</form>
</body>
</html>