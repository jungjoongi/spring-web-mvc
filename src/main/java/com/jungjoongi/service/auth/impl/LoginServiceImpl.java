package com.jungjoongi.service.auth.impl;

import org.springframework.stereotype.Service;

import com.jungjoongi.service.auth.dao.LoginDao;
import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.auth.dto.LoginReqDto;
import com.jungjoongi.service.auth.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	LoginDao loginDao;
	
	LoginServiceImpl(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public LoginInfoDto loginSelectOne(LoginReqDto loginReqDto) {
		
		return loginDao.loginSelectOne(loginReqDto); 
	}


}
