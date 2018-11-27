package com.jungjoongi.common.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	
	@RequestMapping(value = "/test.do", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView modelAndView (
              HttpServletRequest request
            , HttpServletResponse response) {
		
		Map<String, String> model = new HashMap<String, String>();
		
		return new ModelAndView("view/main/main", model);
	}
	
}
