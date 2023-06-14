package com.siarhei.dao.impl;
import com.siarhei.dao.NewsDao;
import com.siarhei.dao.AccauntDao;

public final class DaoProvider {
	private static final DaoProvider instance = new DaoProvider();
	
	private DaoProvider() {
		
	}
	
	private final NewsDao newsDao = new SQLNewsDao(); 
	private final AccauntDao accauntDao = new SQLAccauntDao();
	
	
	
	public NewsDao getNewsDao() {
		return newsDao;
	}

	public AccauntDao getAccauntDao() {
		return accauntDao;
	}

	public static DaoProvider getInstance() {
		return instance;
	}

}
