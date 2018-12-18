package com.jungjoongi.service.auth.service;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.auth.dto.LoginReqDto;

public interface LoginService {
	LoginInfoDto loginSelectOne(LoginReqDto loginReqDto);
}
