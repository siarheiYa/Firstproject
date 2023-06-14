package com.siarhei.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.siarhei.bean.News;
import com.siarhei.dao.DaoException;
import com.siarhei.dao.NewsDao;
import com.siarhei.dao.NewsDaoException;

public class SQLNewsDao implements NewsDao{

	@Override
	public List<News> getList() throws NewsDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> getLatestsList(int count) throws NewsDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public News fetchById(int id) throws NewsDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addNews(News news) throws NewsDaoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateNews(News news) throws NewsDaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNewses(String[] idNewses) throws NewsDaoException {
		// TODO Auto-generated method stub
		
	}



}
