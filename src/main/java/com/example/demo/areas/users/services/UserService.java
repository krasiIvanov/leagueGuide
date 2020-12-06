package com.example.demo.areas.users.services;

import com.example.demo.areas.users.entities.User;
import com.example.demo.areas.users.models.binding.UpdateProfileBindingModel;

public interface UserService {
	
	User getUserByUsername(String username);
	
	boolean updateUser(UpdateProfileBindingModel bindingModel); 
	
}
