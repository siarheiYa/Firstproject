package com.siarhei.dao;

import java.util.List;

import com.siarhei.bean.News;

import com.siarhei.dao.NewsDaoException;

public interface NewsDao {
	List<News> getList() throws NewsDaoException;
	List<News> getLatestsList(int count) throws NewsDaoException;
	News fetchById(int id) throws NewsDaoException;
	int addNews(News news) throws NewsDaoException;
	void updateNews(News news) throws NewsDaoException;
	void deleteNewses(String[] idNewses)throws NewsDaoException;

}
