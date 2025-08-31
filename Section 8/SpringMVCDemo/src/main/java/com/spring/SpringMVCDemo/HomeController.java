package com.spring.SpringMVCDemo;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {

		int result=num+num2+5;
		System.out.println(result);
		mv.addObject("result",result);
//		in result.jsp we cna show data in one way by using this <%= session.getAttribute("result") %>
		mv.setViewName("result");
		return mv;
	}


	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a) { //@ModalAttribute is optional


		return "result";
	}


	@ModelAttribute("course")
	public String CourseNAme(){
		return "JAVA";
	}

}
