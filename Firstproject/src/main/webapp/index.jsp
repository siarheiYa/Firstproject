<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String eMes = (String) request.getAttribute("error");

if(eMes != null){
	
%>
<font color="red">
<%
out.println(eMes);
}
%>
</font>

<form action="Controller" method="post"> 
        <input type="hidden" name="command" value="sign_in" /> 
		Enter login:<br />
		<input type="text" name="login" value="" /><br /> 
		Enter password:<br /> 
		<input type="password" name="password" value="" /><br /> 
<input type="submit" value="Send" /><br />
</form>

<a href="registration.jsp">Registration</a>
</body>
</html>