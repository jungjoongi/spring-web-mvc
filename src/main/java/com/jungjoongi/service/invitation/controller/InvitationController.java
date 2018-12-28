package com.jungjoongi.service.invitation.controller;

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

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.dto.EstimateSelectDto;
import com.jungjoongi.service.estimate.dto.SaveMemoDto;
import com.jungjoongi.service.estimate.dto.SaveMemoReqDto;
import com.jungjoongi.service.estimate.impl.EstimateServiceImpl;

@Controller
public class InvitationController {
	private final static Logger LOGGER = LogManager.getLogger(InvitationController.class);
	
	
	@RequestMapping(value = {"/invitation/view.do"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView invitation(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) {
		LOGGER.debug("CustConsultController.list() #START");
		Map<String, Object> model = new HashMap<>();
		if(session.getAttribute("loginInfo") == null) {
			return new ModelAndView("redirect:/login.do");
		}
		LoginInfoDto info = (LoginInfoDto)session.getAttribute("loginInfo");
		model.put("memId", info.getMemId());
		
		return new ModelAndView("view/invitation/view", model);
	}
	
	
}
