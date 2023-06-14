package com.siarhei.service.impl;

import java.sql.SQLException;

import com.siarhei.bean.RegNewInfo;
import com.siarhei.bean.User;
import com.siarhei.dao.AccauntDao;
import com.siarhei.dao.DaoException;
import com.siarhei.dao.impl.DaoProvider;
import com.siarhei.service.ServiceException;
import com.siarhei.service.UserService;

public class UserServiceImpl implements UserService{
	
	private final AccauntDao accauntDao = DaoProvider.getInstance().getAccauntDao();
	
	public String signIn(String login, String password) throws ServiceException {
		
		//deep validation
		
		try {
			
		    accauntDao.registration(null);  //signIn нужен
		}catch(DaoException e) {
			throw new ServiceException(e);
		}
		return null;
	}
	
	public boolean registration(RegNewInfo newUser) {
		return false;
	}

}
