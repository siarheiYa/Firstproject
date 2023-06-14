package com.siarhei.dao;

import com.siarhei.bean.RegNewInfo;

public interface AccauntDao {
	
	boolean registration(RegNewInfo User) throws DaoException;
	boolean logination(String login, String password)throws DaoException;
	String getRole(String login, String password) throws DaoException;

}
