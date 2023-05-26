<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="com.siarhei.bean.User" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
User userX = (User) request.getAttribute("user");
if(userX ==null) {
	userX = new User();
}
out.println(userX.getName());
%>
 <br />
 <%
 out.println(request.getParameter("login"));
 %>
 
 <jsp:useBean id="user" class="com.siarhei.bean.User" scope="request" />
 <jsp:getProperty property="name" name="user"/>
 
</body>
</html>