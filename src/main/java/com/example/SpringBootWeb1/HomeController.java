package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}
	
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
	
//	@RequestMapping("addAlien")
//	public ModelAndView addAlien(@RequestParam("aid") int id, String aname, ModelAndView mv) {	
//		Alien alien = new Alien();
//		alien.setAid(id);
//		alien.setAname(aname);
//		
//		mv.addObject("alien", alien);
//		mv.setViewName("result");
//		return mv;
//	}
	
//	public String addAlien(@@ModelAttribute("alien") Alien alien1){...} -> @ModelAttribute is mainly 
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		return "result";
	}
}











