package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjpowernode.doamin.User;
import com.bjpowernode.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService uService;
	
	@RequestMapping(value="add.do")
	public ModelAndView addUser(String username,String password){
		System.out.println(username+";   " + password);
		ModelAndView mv = new ModelAndView();
		Integer number = uService.addUser(username,password);
		
		if (number > 0) {
			mv.addObject("yesAdd", "保存成功");
			mv.setViewName("addUserYes");
		}else {
			mv.addObject("noAdd", "保存失败");
			mv.setViewName("addUserNo");
		}
		
		return mv;
	}
	
}
