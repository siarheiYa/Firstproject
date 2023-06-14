package com.siarhei.service;

import com.siarhei.service.impl.NewsServiceImpl;
import com.siarhei.service.impl.UserServiceImpl;

public final class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	
	private final UserService userService = new UserServiceImpl();
	private final NewsService newsService = new NewsServiceImpl();
	
	
	
	
	public UserService getUserService() {
		return userService;
	}




	public NewsService getNewsService() {
		return newsService;
	}




	public static ServiceProvider getInstance() {
		return instance;
	}

}
