package com.johnbarrett.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyCtrl {
	@RequestMapping("/")
	public String survey() {
		return "/DojoSurvey/survey.jsp";
	}
}