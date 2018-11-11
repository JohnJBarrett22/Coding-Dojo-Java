package com.johnbarrett.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnbarrett.authentication.models.User;
import com.johnbarrett.authentication.services.UserService;
import com.johnbarrett.authentication.validators.UserValidator;

@Controller
public class UserCont {
	private final UserService userService;
	private final UserValidator userValidator;
	
	public UserCont(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	
	@GetMapping("/registration")
	public String registration(@ModelAttribute("userObj") User user) {
		return "views/registration.jsp";
	}
	
	@GetMapping("/login")
	public String login() {
		return "views/login.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("userObj") User user, BindingResult result, Model model, HttpSession session) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			return "views/registration.jsp";
		}
		boolean isDuplicate = userService.duplicateUser(user.getEmail());
		if(isDuplicate) {
			model.addAttribute("error", "Email already in use! Please try again with a different email address!");
			return "views/registration.jsp";
		}
		User u = userService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/home";
	}
	
	@PostMapping("/signin")
	public String signIn(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if(isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/home";
		}
		else {
			model.addAttribute("error", "Invalid Credentials! Please try again with the correct user information!");
			return "views/login.jsp";	
		}
	}
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		model.addAttribute("user", u);
		return "views/home.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
}