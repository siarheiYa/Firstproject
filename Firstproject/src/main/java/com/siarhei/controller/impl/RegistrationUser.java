package com.siarhei.controller.impl;

import java.io.IOException;

import com.siarhei.controller.Command;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationUser implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	
		System.out.println("name " + name + ", emale =" + email); 
		
		int error = 1;
		
		if(error == 1) {
			request.setAttribute("error", "Problem with registration!");
		}
		
	
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(request, response);
	}

}
