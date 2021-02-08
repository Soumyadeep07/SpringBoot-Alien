package com.rakuten.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
	
	@Autowired
	AlienDAO dao;
	
	@RequestMapping("home")
	public String home() {
		
		
		return "home.jsp";
	}
	
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		dao.save(alien);
		return "home.jsp";
	}
	
	// This is for searching from browser
	
	@RequestMapping("getAlien")
	public ModelAndView getAlien(@RequestParam int id) {
		
		ModelAndView mv = new ModelAndView("view.jsp");
		
		//dao.save(alien);
		
		Alien alien = dao.findById(id).orElse(new Alien());
		mv.addObject(alien);
		
		return mv;
	}
	
	
	// IMPLEMENTATION OF REST API USING LINKS...
	
	@RequestMapping("/alien/{id}")
	@ResponseBody
	public String getAlienById(@PathVariable("id") int id) {
		return dao.findById(id).toString();
	}
	
	// Get All Aliens
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAllAlien() {
		return dao.findAll().toString();
		//return dao.findAll();
	}
	
	
	
	

}
