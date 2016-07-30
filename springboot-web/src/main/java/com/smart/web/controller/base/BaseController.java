package com.smart.web.controller.base;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * 所有controller均继承该类
 * 
 * Description: 
 * @author SongWei
 * @date 2016年7月30日
 * @version 1.0
 */
public class BaseController {
	
	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView(){
		ModelAndView moderAndView = new ModelAndView();
		String contextPath = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getContextPath();
		moderAndView.addObject("BASEURL_CONTEXT",contextPath);
		moderAndView.addObject("BASEURL_ADMIN",contextPath + "sysadmin");
		return moderAndView;
	}
	
	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
}
