package com.johnbarrett.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnbarrett.dojooverflow.models.Question;
import com.johnbarrett.dojooverflow.services.OverflowService;

@Controller
@RequestMapping("/questions")
public class OverflowCont {
	private final OverflowService overflowService;
	
	public OverflowCont(OverflowService overflowService) {
		this.overflowService = overflowService;
	}
	
	@GetMapping("")
	public String questionsDashboard() {
		return "views/index.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestions(@ModelAttribute("questionObject") Question question) {
		return "views/new.jsp";
	}
	
	@PostMapping("/addquestion")
	public String addQuestion(@RequestParam("tagReq") String tags, @Valid @ModelAttribute("questionObject") Question question, BindingResult result) {
		
		return "redirect:/views/new.jsp";
	}
}