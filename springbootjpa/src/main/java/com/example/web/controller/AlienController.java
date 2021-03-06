package com.example.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.dao.AlienRepo;
import com.example.web.model.Alien;


@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
     public String home()   
     {
    	 return "home.jsp";
     }
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	

	@DeleteMapping("/aliens/{aid}")
	@ResponseBody()
	public String deleteAlien(@PathVariable int aid)
	{
	    Alien a=repo.getOne(aid);
		repo.delete(a);
		return "success";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView addAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		
		System.out.println(repo.findByTech("java"));
		
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody()
	public List<Alien> getAliens()
	{
	
		return repo.findAll();
	}
	
	@PostMapping("/addAlien")
	public Alien addAliens(Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody()
	public Optional<Alien> getAliens(@PathVariable int aid)
	{
	
		return repo.findById(aid);
	}
}
