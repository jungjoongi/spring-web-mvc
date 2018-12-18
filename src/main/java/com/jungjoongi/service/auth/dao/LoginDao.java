package com.jungjoongi.service.auth.dao;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.auth.dto.LoginReqDto;

public interface LoginDao {
	public LoginInfoDto	 loginSelectOne(LoginReqDto loginReqDto); 
}
