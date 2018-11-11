package com.johnbarrett.eventsbeltreviewer.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnbarrett.eventsbeltreviewer.models.Event;
import com.johnbarrett.eventsbeltreviewer.models.Message;
import com.johnbarrett.eventsbeltreviewer.models.User;
import com.johnbarrett.eventsbeltreviewer.services.BeltReviewerService;
import com.johnbarrett.eventsbeltreviewer.validators.UserValidator;

@Controller
public class BeltReviewerController {
	private final BeltReviewerService beltReviewerService;
	private final UserValidator userValidator;

	public BeltReviewerController(BeltReviewerService beltReviewerService, UserValidator userValidator) {
		this.beltReviewerService = beltReviewerService;
		this.userValidator = userValidator;
	}
	
	ArrayList<String> states = new ArrayList<String>(Arrays.asList("AL", "AK", "AZ", "AR", "CA", "CO", "CT",
			"DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN",
			"MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI",
			"SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"));
	
	//Index
	@GetMapping("")
	public String index(@ModelAttribute("userObj") User user, Model model) {
		model.addAttribute("states", states);
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("userObj") User user, BindingResult result, Model model, HttpSession session) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			model.addAttribute("states", states);
			return "index.jsp";
		}
		boolean isDuplicate = beltReviewerService.duplicateUser(user.getEmail());
		if(isDuplicate) {
			model.addAttribute("error", "Email already in use! Please try again with a different email address!");
			return "index.jsp";
		}
		User u = beltReviewerService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/events";
	}
	
	@PostMapping("login")
	public String signIn(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
		boolean isAuthenticated = beltReviewerService.authenticateUser(email, password);
		if(isAuthenticated) {
			User u = beltReviewerService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/events";
		}
		else {
			model.addAttribute("error", "Invalid Credentials! Please try again with the correct user information!");
			return "index.jsp";	
		}
	}
	
	//Dashboard
	@GetMapping("/events")
	public String dashboard(@Valid @ModelAttribute("eventObj") Event event, BindingResult result, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		User user = beltReviewerService.findUserById((Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		session.setAttribute("states", states);
        List<Event> events = beltReviewerService.allEvents();
        List<Event> instate = new ArrayList<Event>();
        List<Event> outofstate = new ArrayList<Event>();
        for(Event origin: events) {
        	if(origin.getState().equals(user.getState())) {
        		instate.add(origin);
        	}
        	else {
        		outofstate.add(origin);
        	}
        }
        model.addAttribute("instate", instate);
        model.addAttribute("outofstate", outofstate);
		return "dashboard.jsp";
	}
	
	@GetMapping("/events/{id}")
	public String viewEvent(@PathVariable("id") Long id, @Valid @ModelAttribute("messageObj") Message message, BindingResult result, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		User user = beltReviewerService.findUserById((Long) session.getAttribute("userId"));
		Event event = beltReviewerService.findEventById(id);
		List<Message> messages = event.getMessages();
		Collections.reverse(messages);
		model.addAttribute("event", event);
		model.addAttribute("user", user);
		model.addAttribute("attendees", event.getJoinedUsers());
		model.addAttribute("messages", messages);
		return "details.jsp";
	}

	@GetMapping("/events/{id}/edit")
	public String editPage(@PathVariable("id") Long id, @ModelAttribute("event") Event event, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		User user = beltReviewerService.findUserById((Long)session.getAttribute("userId"));
		if(beltReviewerService.findEventById(id).getUser().getId() == user.getId()) {
			model.addAttribute("event", beltReviewerService.findEventById(id));
			return "edit.jsp";
		}
		else {
			return "redirect:/";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//CRUD
	@PostMapping("/addevent")
	public String addEvent(@Valid @ModelAttribute("eventObj") Event event, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "dashboard.jsp";
		}
		else {
			beltReviewerService.addEvent(event);
			return "redirect:/events";	
		}	
	}
	
	@PutMapping("/events/{id}/edit")
	public String editEvent(@Valid @PathVariable("id") Long id, @ModelAttribute("event") Event event, BindingResult result, Model model, HttpSession session) {
		User user = beltReviewerService.findUserById((Long)session.getAttribute("userId"));
		if(beltReviewerService.findEventById(id).getUser().getId() == user.getId()) {
			if(result.hasErrors()) {
				model.addAttribute("event", beltReviewerService.findEventById(id));
				return "edit.jsp";
			}
			else {
				Event eventEdit = beltReviewerService.findEventById(id);
				model.addAttribute("event", eventEdit);
				model.addAttribute("user", user);
				event.setUser(user);
				event.setJoinedUsers(event.getJoinedUsers());
				beltReviewerService.updateEvent(event);
				return "redirect:/events";
			}
		}
		else {
			return "redirect:/";
		}
	}
	
	@RequestMapping("/events/{id}/join")
	public String joinEvent(@PathVariable("id") Long id, HttpSession session) {
		User user = beltReviewerService.findUserById((Long) session.getAttribute("userId"));
		Event event = beltReviewerService.findEventById(id);
		List<User> attendees = event.getJoinedUsers();
		attendees.add(user);
		event.setJoinedUsers(attendees);
		beltReviewerService.updateUser(user);	
		return "redirect:/events";
	}
	
    @RequestMapping("/events/{id}/cancel")
    public String cancelEvent(@PathVariable("id") Long id, HttpSession session) {
    	User user = beltReviewerService.findUserById((Long) session.getAttribute("userId"));
		Event event = beltReviewerService.findEventById(id);
    	List<User> attendees = event.getJoinedUsers();
        for(int i=0; i<attendees.size(); i++) {
            if(attendees.get(i).getId() == user.getId()) {
            	attendees.remove(i);
            }
        }
        event.setJoinedUsers(attendees);
        beltReviewerService.updateUser(user);
    	return "redirect:/events";
    }
    
    @RequestMapping("/events/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
    	Event event = beltReviewerService.findEventById(id);
    	for(User user: event.getJoinedUsers()) {
    		List<Event> myevents = user.getJoinedevents();
    		myevents.remove(event);
    		user.setJoinedevents(myevents);;
    		beltReviewerService.updateUser(user);
    	}
//    	for(Message message: mServ.allMessages()) {
//    		if(message.getEvent() == event) {
//    			mServ.delete(message.getId());
//    		}
//    	}
    	beltReviewerService.deleteEvent(id);
    	return "redirect:/events";
    }
	
	@PostMapping("events/addmsg")
	public String addMessage(@ModelAttribute("messageObj") Message message, Model model, HttpSession session) {
		User user = beltReviewerService.findUserById((Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		beltReviewerService.newMessage(message);
		return "redirect:/events";
		
	}
}