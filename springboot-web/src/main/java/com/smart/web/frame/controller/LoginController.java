package com.smart.web.frame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smart.web.base.BaseController;
/**
 * 
 * Description: 
 * @author SongWei
 * @date 2016年7月30日
 * @version 1.0
 */
@Controller
public class LoginController extends BaseController{
	
	@RequestMapping(value="/login")
	public ModelAndView login () {
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping(value = "/sysadmin")
	@ResponseBody
	public Object test () {
		return "ssss";
		
	}
}
