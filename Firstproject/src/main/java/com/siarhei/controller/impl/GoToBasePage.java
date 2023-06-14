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


// 
public class GoToBasePage implements Command  {
	
	private final NewsService newsService = ServiceProvider.getInstance().getNewsService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<News> latestNews;
		try {
			latestNews = newsService.latestList(5);
			request.setAttribute("news", latestNews);
			
			request.getRequestDispatcher("WEB-INF/pages/layouts/baseLayout.jsp").forward(request, response);
		} catch(ServiceException e) {
			e.printStackTrace();
		}
		
	}

}
