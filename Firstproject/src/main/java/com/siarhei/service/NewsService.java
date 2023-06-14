package com.siarhei.service;

import java.util.List;

import com.siarhei.bean.News;

public interface NewsService {
	
	 void add(News news) throws ServiceException;
	 News find (int id)throws ServiceException;
	 News findById(int id)throws ServiceException;
	 
	List<News> latestList(int i)throws ServiceException;
	List<News> list()throws ServiceException;

}
