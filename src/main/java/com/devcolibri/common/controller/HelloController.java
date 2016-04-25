package com.devcolibri.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	public  int[] f(){
		MyClass myClass = new MyClass();
		int [] ff = myClass.m1();
		return  ff;
	}
	public  int[] f2(){
		MyClass myClass = new MyClass();
		int [] ff = myClass.m2();
		return  ff;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		MyClass myClass = new MyClass();
		int [] ff = myClass.m1();
		//ff[0]=
		model.addAttribute("message",ff);
		return "hello";

	}
	
}