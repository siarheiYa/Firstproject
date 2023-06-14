package com.siarhei.controller.impl;

import java.io.IOException;
import java.util.List;



import com.siarhei.bean.News;
import com.siarhei.controller.Command;
import com.siarhei.service.NewsService;
import com.siarhei.service.ServiceException;
import com.siarhei.service.ServiceProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class GoToNewsList implements Command{
	private final NewsService newsService = ServiceProvider.getInstance().getNewsService();
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<News> newsList;
		try {
			newsList = newsService.list();
			request.setAttribute("news", newsList);
			
			request.setAttribute("presentation", "newsList");
			//request.setAttribute("news", null);

			request.getRequestDispatcher("WEB-INF/pages/layouts/baseLayout.jsp").forward(request, response);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
