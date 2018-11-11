package com.johnbarrett.driverslicense.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.johnbarrett.driverslicense.models.License;
import com.johnbarrett.driverslicense.models.Person;
import com.johnbarrett.driverslicense.services.LicenseService;
import com.johnbarrett.driverslicense.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	
	public LicenseController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("licenseObject") License license, Model model) {
		List<Person> personslist = personService.allPerson();
		model.addAttribute("personslist", personslist);
		ArrayList<String> states = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
				"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
				"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
				"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
				"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
				"Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
		model.addAttribute("states", states);
		return "DriversLicense/newlicense.jsp";
	}
	
	@RequestMapping(value="/addlicense", method=RequestMethod.POST)
	public String addlicense(@Valid @ModelAttribute("licenseObject") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "DriversLicense/newlicense.jsp";
		}
		else {
			String number = licenseService.generateLicenseNumber();
			license.setNumber(number);
			licenseService.addLicense(license);
			return "redirect:/persons/" +license.getId();
		}
	}
}