<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
       	<div class="page">
		<div class="header">
			<c:import url="/WEB-INF/pages/titles/header.jsp" />
		</div>

		<div class="base-layout-wrapper">
			<div class="menu">

				<c:if test="${not (sessionScope.user eq 'active')}">
				    Welcome to the page!!!!!
					<!-- Выше дописать что показываем не зарегестрированному пользователю -->
					
				</c:if>
				<c:if test="${sessionScope.user eq 'active'}">
					<c:import url="/WEB-INF/pages/titles/menu.jsp" />
				</c:if>
		</div>

		<div class="content">

				<c:if test="${not (sessionScope.user eq 'active')}">
					<c:import url="/WEB-INF/pages/titles/guestInfo.jsp" />
				</c:if>
				<c:if test="${sessionScope.user eq 'active'}">
					<c:import url="/WEB-INF/pages/titles/body.jsp" />
				</c:if>


			</div>
		</div>

		<div class="footer">

			<c:import url="/WEB-INF/pages/titles/footer.jsp" />
		</div>
	</div>

</body>
</html>