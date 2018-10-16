package com.cours.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Profil {
	
	@RequestMapping(value="/Profil/liste")
	public ModelAndView liste(){
		return new ModelAndView("profil/liste");
	}

}
