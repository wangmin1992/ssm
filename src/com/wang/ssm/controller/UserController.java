package com.wang.ssm.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wang.ssm.been.User;
import com.wang.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private Logger LOG = LoggerFactory.getLogger(UserController.class); 
	
	@Resource(name="userServiceImpl")
	private UserService userService;
	
	@RequestMapping("/showUserInfo")
	public ModelAndView showUserInfo(){
		User user=null;
        try {
            user = userService.getUserById(1);
            LOG.info(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView view=new ModelAndView("WEB-INF/pages/showUserInfo");
        view.addObject("user", user);
        return view;
	}
	
}
