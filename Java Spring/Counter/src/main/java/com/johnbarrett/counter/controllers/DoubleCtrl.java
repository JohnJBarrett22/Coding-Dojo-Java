package com.johnbarrett.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoubleCtrl {
	@RequestMapping("/double")
	public String dubs(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
        Integer count = (Integer) session.getAttribute("count");
		count += 2;
		session.setAttribute("count", count);
		return "/Counter/double.jsp";
	}
}
