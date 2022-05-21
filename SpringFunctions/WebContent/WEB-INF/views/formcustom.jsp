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
	<h1>Form Custom Tag</h1>
	<form:form modelAttribute="userBean" action="formcustom">
		이름: <input type='text' name='user_name' value="${requestScope.userBean.user_name }"/><br/>
		<!-- Form Custom Tag -->
		아이디: <form:input path='user_id'/><br/>
		비밀번호: <form:password path='user_pw' showPassword='true'/><br/>
		<button type='submit'>제출</button>
	</form:form>
</body>
</html>