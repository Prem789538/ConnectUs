package org.me.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.me.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BaseController {
	
	@GetMapping(value = "/")
	private ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@GetMapping(value = "/login")
	private ModelAndView login() {
		User user = new User();
		
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("user",user);
		return mv;
	}
	
	@PostMapping(value = "/login")
	private ModelAndView loginCheck(User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",user);
		if(!user.getEmail().equals("foo"))
			mv.setViewName("error");
		else
			mv.setViewName("user_home");
		return mv;
	}
	
	@GetMapping(value = "signup")
	private ModelAndView signUp() {
		ModelAndView mv = new ModelAndView("create_account");
		User user = new User();
		mv.addObject("user",user);
		return mv;
	}
	
	@PostMapping(value = "signup")
	private ModelAndView createAccount(User user) {
		ModelAndView mv = new ModelAndView("user_home");
		System.out.println(user);
		SessionFactory factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(User.class)
							.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		return mv;
		
	}
	
	
	
	

}
