package com.example.demo.areas.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.areas.users.models.binding.UpdateProfileBindingModel;
import com.example.demo.areas.users.services.UserService;
import com.example.demo.constants.ViewConstants;

@Controller
@RequestMapping("user")
public class UserController {
	
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping("profile")
	public String profille(Model model) {
		
		model.addAttribute("user", this.userService.getUserByUsername("krasko"));
		model.addAttribute("view",ViewConstants.ProfileView);
		
		return  ViewConstants.BaseLayoutView;
	}
	
	@PostMapping("profile")
	public String updateProfile(UpdateProfileBindingModel bindingModel, BindingResult result) {
		
//		if(result.hasErrors()) {
//			
//		}else {
//			
//		}
		
		userService.updateUser(bindingModel);
		
		return "redirect:/user/profile";
		
	}
	
	
	
}
