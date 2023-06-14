package com.siarhei.dao.impl;


import com.siarhei.bean.RegNewInfo;
import com.siarhei.dao.AccauntDao;
import com.siarhei.dao.DaoException;

public class SQLAccauntDao implements AccauntDao{

	@Override
	public boolean registration(RegNewInfo User) throws DaoException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean logination(String login, String password) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getRole(String login, String password) throws DaoException {
		// TODO Auto-generated method stub
		return "user";
	}

	
	

}
