package com.siarhei.controller.impl;

import java.io.IOException;

import com.siarhei.controller.Command;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignOut implements Command {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			request.getSession(true).setAttribute("user", "not active");
			response.sendRedirect("index.jsp");
		
	}

}
