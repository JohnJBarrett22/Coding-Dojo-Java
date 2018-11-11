package com.johnbarrett.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SuccessCtrl {
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String success(@RequestParam(value="code") String code, RedirectAttributes errormsg) {
		if(code.equals("Bushido")) {
			return "/TheCode/code.jsp";			
		}
		else {
	        errormsg.addFlashAttribute("error", "You must train harder!");
	        return "redirect:/";
		}
	}	
}