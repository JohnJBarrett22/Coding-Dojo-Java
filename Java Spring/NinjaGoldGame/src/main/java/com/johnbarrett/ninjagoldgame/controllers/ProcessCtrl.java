package com.johnbarrett.ninjagoldgame.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessCtrl {
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@RequestParam(value="building") String building, HttpSession session) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		if(building.equals("farm")) {
			int num = ThreadLocalRandom.current().nextInt(10, 20 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a farm and earned "+num+" gold. ("+timeStamp+")");
		}
		if(building.equals("cave")) {
			int num = ThreadLocalRandom.current().nextInt(5, 10 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a cave and earned "+num+" gold. ("+timeStamp+")");
		}
		if(building.equals("house")) {
			int num = ThreadLocalRandom.current().nextInt(2, 5 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a house and earned "+num+" gold. ("+timeStamp+")");
		}
		if(building.equals("casino")) {
			int num = ThreadLocalRandom.current().nextInt(-50, 50 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			if(num > 0) {
				activities.add(0,"You entered a casino and earned "+num+" gold. ("+timeStamp+")");
			}
			else {
				activities.add(0, "You entered a casino and lost "+num+" gold. ("+timeStamp+")");
			}
		}
		return "redirect:/";
	}
}