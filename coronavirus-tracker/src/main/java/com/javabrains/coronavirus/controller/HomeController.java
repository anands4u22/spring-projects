package com.javabrains.coronavirus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javabrains.coronavirus.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	
	@GetMapping
	public String home(Model model)
	{
		
		int totalReportedCases=coronaVirusDataService.getAllStats().stream().mapToInt(p->p.getLatestTotalCases()).sum();
		model.addAttribute("locationStats",coronaVirusDataService.getAllStats());
		model.addAttribute("totalReportedCases",totalReportedCases);
		
		return "home";
	}

}
