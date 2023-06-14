package com.siarhei.controller.impl;

import java.io.IOException;



import com.siarhei.controller.Command;
import com.siarhei.service.ServiceException;
import com.siarhei.service.ServiceProvider;
import com.siarhei.service.UserService;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignInUser implements Command {
	
	private final UserService service = ServiceProvider.getInstance().getUserService();

	private static final String JSP_LOGIN_PARAM = "login";
	private static final String JSP_PASSWORD_PARAM = "password";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login;
		String password;

		login = request.getParameter(JSP_LOGIN_PARAM);
		password = request.getParameter(JSP_PASSWORD_PARAM);

		// small validation

		try {

			String role = service.signIn(login, password);
			
			if (!role.equals("guest")) { // user   admin
				request.getSession(true).setAttribute("user", "active");
				request.getSession().setAttribute("role", role);
				response.sendRedirect("controller?command=go_to_news_list");
			} else {
				request.getSession(true).setAttribute("user", "not active");
				request.setAttribute("AuthenticationError", "wrong login or password");
				request.getRequestDispatcher("/WEB-INF/pages/layouts/baseLayout.jsp").forward(request, response);
			}
			
		} catch (ServiceException e) {
			// logging e
			// go-to error page

		}

		// response.getWriter().print("do logination");

	}

}
