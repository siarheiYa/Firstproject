<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Registration</h1>
    <br>

    <form action="${pageContext.request.contextPath}/Controller" method="post">
    
     <input type="hidden" name="command" value="registration" /> 
     
     <label>
          <input type="text" name="name"  value="">
      </label>
      Enter name:<br>
      <label>
          <input type="text" name="email"  value="">
     </label>
     Enter email:<br>
      <button type="submit" value="Submit">Registration</button>
    </form>

</body>
</html>