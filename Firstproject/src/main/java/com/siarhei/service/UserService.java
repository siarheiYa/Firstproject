package com.siarhei.service;

import com.siarhei.bean.RegNewInfo;
import com.siarhei.bean.User;


public interface UserService {
	
	 String signIn(String login, String password)throws ServiceException;	
	 boolean registration(RegNewInfo newUser)throws ServiceException;

}
