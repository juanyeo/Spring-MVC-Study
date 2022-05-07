<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Session Scope</h1>
	<h3>data : ${sessionScope.s_data1 }</h3>
	<h3>bean data1 : ${sessionScope.sessionBean1.data1 }</h3>
	<h3>bean data2 : ${sessionScope.sessionBean1.data2 }</h3>
</body>
</html>