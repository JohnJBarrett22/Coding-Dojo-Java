package com.johnbarrett.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodeCtrl {
	@RequestMapping("/")
	public String index() {
		return "/TheCode/index.jsp";
	}
}