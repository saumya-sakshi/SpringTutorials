package com.telusko.SpringBootWeb1;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		//System.out.println("Home method called");
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num, int num2, Model model) {

		int result=num+num2+5;
		System.out.println(result);
		model.addAttribute("result",result);
//		in result.jsp we cna show data in one way by using this <%= session.getAttribute("result") %>
		return "result";
	}

}
