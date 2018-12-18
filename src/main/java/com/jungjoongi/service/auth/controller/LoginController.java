package com.jungjoongi.service.auth.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.auth.dto.LoginReqDto;
import com.jungjoongi.service.auth.impl.LoginServiceImpl;

@Controller
public class LoginController {
	private final static Logger LOGGER = LogManager.getLogger(LoginController.class);
	
	LoginServiceImpl loginServiceImpl;
	
	LoginController(LoginServiceImpl loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}
	
	@RequestMapping(value = {"/login.do"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		LOGGER.debug("LoginController.view() #START");
		
		
		return new ModelAndView("view/login/login");
	}
	
	@RequestMapping(value = {"/logout.do"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView logout(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		session.invalidate();
		
		return new ModelAndView("view/login/login");
	}
	
	
	@RequestMapping(value = {"/login.json"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView loginJson(
			LoginReqDto loginReqDto,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		Map<String, Object> model = new HashMap<>();
		System.out.println(session.getAttribute("loginInfo"));
		if(session.getAttribute("loginInfo") != null) {
			model.put("rt", "0001");
			model.put("rtMsg", "이미 로그인 되어있습니다.");
			model.put("location", "/spring-web-project/estimate/view.do");
			return new ModelAndView("jsonView", model);
		}
		LoginInfoDto loginInfo = loginServiceImpl.loginSelectOne(loginReqDto);
		if (loginInfo != null) {
			model.put("rt", "0000");
			model.put("location", "/spring-web-project/estimate/view.do");
			session.setAttribute("loginInfo", loginInfo);
			return new ModelAndView("jsonView", model);
		}
		model.put("rt", "FFFF");
		model.put("rtMsg", "로그인 실패");
		return new ModelAndView("jsonView", model);
	}
	
}
