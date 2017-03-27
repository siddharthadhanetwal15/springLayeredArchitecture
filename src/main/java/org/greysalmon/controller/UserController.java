package org.greysalmon.controller;

import java.util.Map;

import org.greysalmon.model.User;
import org.greysalmon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Map<String,Object> map) {
		map.put("user", new User());
		return "user/register";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create( User user, Map<String,Object> map) {
		userService.create(user);
		return "redirect:/user/details/" + user.getUserId();
	}
	
	@RequestMapping(value="/details/{userId}", method=RequestMethod.GET)
	public String details(@PathVariable("userId") Long userId,
	Map<String,Object> map) {	
		User user=userService.find(userId);
		map.put("fname", user.getFname());
		return "user/details";
	}
}
