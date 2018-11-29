package com.jungjoongi.service.estimate.controller;

import java.util.HashMap;
import java.util.List;
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

import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.impl.EstimateServiceImpl;

@Controller
public class EstimateController {
	private final static Logger LOGGER = LogManager.getLogger(EstimateController.class);
	
	EstimateServiceImpl estimateServiceImpl;
	
	EstimateController(EstimateServiceImpl estimateServiceImpl) {
		this.estimateServiceImpl = estimateServiceImpl;
	}
	
	@RequestMapping(value = {"/estimate/view.do"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView EstimateView(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		LOGGER.debug("CustConsultController.list() #START");
		Map<String, Object> model = new HashMap<>();
		
		List<EstimateDto> list = estimateServiceImpl.EstimateList();
		model.put("list", list);
		
		return new ModelAndView("view/estimate/view", model);
	}
	
	@RequestMapping(value = {"/estimate/insert.json"}, method= {RequestMethod.POST})
	public ModelAndView insert(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session,
			EstimateReqDto estimateReqDto) {
		Map<String, Object> model = new HashMap<>();
		
		if(estimateServiceImpl.EstimateInsert(estimateReqDto) > 0) {
			model.put("rt", "SUCCESS");
		}
		
		return new ModelAndView("jsonView", model);
	}
}
