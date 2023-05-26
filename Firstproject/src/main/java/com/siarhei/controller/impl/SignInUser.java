package com.siarhei.controller.impl;

import java.io.IOException;

import com.siarhei.bean.User;
import com.siarhei.controller.Command;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignInUser implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setName("Siarhei");
		user.setAge(29);

		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
				requestDispatcher.forward(request, response);
		
	}

}
