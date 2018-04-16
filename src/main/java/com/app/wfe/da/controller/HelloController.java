package com.app.wfe.da.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class HelloController.
 */
@Controller
public class HelloController {

	@RequestMapping("/")
	public String sayHello(ModelMap modal) {
		 modal.addAttribute("title", "Dear Learner");
	     modal.addAttribute("message", "Welcome to SpringBoot");
		
		return "Hello";
	}
}
