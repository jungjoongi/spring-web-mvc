package com.jungjoongi.service.auth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jungjoongi.service.estimate.impl.EstimateServiceImpl;

@Controller
public class LoginController {
	private final static Logger LOGGER = LogManager.getLogger(LoginController.class);
	
	EstimateServiceImpl estimateServiceImpl;
	
	LoginController(EstimateServiceImpl estimateServiceImpl) {
		this.estimateServiceImpl = estimateServiceImpl;
	}
	
	@RequestMapping(value = {"/login.do"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView EstimateView(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		LOGGER.debug("LoginController.view() #START");
		
		
		return new ModelAndView("view/login/login");
	}
	
	
}
