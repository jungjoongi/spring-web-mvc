package com.jungjoongi.estimate.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jungjoongi.estimate.dto.EstimateReqDto;
import com.jungjoongi.estimate.service.EstimateService;

@Controller
public class EstimateController {
	private final static Logger LOGGER = LogManager.getLogger(EstimateController.class);
	
	@Autowired EstimateService estimateService;
	
//	EstimateController(EstimateService estimateService) {
//		this.estimateService = estimateService;
//	}
//	
	@RequestMapping(value = "/estimate/view.do", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView EstimateView(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		Map<String, String> model = new HashMap<String, String>();
		LOGGER.debug("CustConsultController.list() #START");
		
		return new ModelAndView("view/estimate/view", model);
	}
	
	@RequestMapping(value = "/estimate/insert.json", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView insert(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session,
			EstimateReqDto estimateReqDto) {
		
		
		Map<String, String> model = new HashMap<String, String>();
		LOGGER.debug("CustConsultController.list() #START");
		
		return new ModelAndView("view/estimate/view", model);
	}
}
