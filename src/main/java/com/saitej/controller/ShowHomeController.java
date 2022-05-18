package com.saitej.controller;

import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("sysDate",now );
		mav.setViewName("home");
		return mav;
		
	//	return new ModelAndView("home","sysDate",new Date());// lvn, modelattributename,modelattributevalue
	}

}
