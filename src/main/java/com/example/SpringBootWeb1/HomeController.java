package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("Inside home");
		return "index";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {		
		
		int sum = num+num2;
		
		mv.addObject("sum", sum);
		mv.setViewName("result");
		
		return mv;
	}
}
