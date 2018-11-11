package com.johnbarrett.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanController {

	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery, Model model) {
        if(searchQuery != null){
            model.addAttribute("name", searchQuery);
            return "/Human/index.jsp";
        }
        else
        	model.addAttribute("name", "Human");
        	return "/Human/index.jsp";
	}
}