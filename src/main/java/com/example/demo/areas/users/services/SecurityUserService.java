package com.example.demo.areas.users.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.areas.users.models.binding.UserRegistrationBindingModel;

public interface SecurityUserService extends UserDetailsService {
	
	void register(UserRegistrationBindingModel bindingModel);
	
}
