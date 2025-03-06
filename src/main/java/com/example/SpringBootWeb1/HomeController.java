package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String add(@RequestParam("num1") int num, int num2, Model model) {		
		
		int sum = num+num2;
		
		model.addAttribute("sum", sum);
		
		return "result";
	}
}
