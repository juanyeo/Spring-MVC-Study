<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href='home'>Home</a><br/>
	<a href='requestmapping'>Request Mapping</a><br/>
	<a href='getparameter?data1=100&data2=200'>Get Parameter</a><br/>
	<a href='pathvariable/100/200/300'>@ Path Variable</a><br/>
	<a href='requestparam?data1=100&data2=200'>@ Request Param</a><br/>
	<a href='getobject1?data1=100&data2=200&data3=300&data3=400'>Get Parameter Object</a><br/>
	<a href='getobject2?data1=100&data2=200&data3=300&data3=400'>Get Parameter Object (Bean)</a><br/>
	<a href='viewresolver1'>Pass Data to View (HttpServletRequest)</a><br/>
	<a href='viewresolver2'>Pass Data to View (Model)</a><br/>
	<a href='viewresolver3'>Pass Data to View (ModelAndView)</a><br/>
	<a href='commandobject'>Command Object</a><br/>
	<a href='formcustom'>Form Custom Tag</a><br/>
	<a href='redirect'>Redirect to Destination</a>
	<a href='forward'>Forward to Destination</a>
</body>
</html>