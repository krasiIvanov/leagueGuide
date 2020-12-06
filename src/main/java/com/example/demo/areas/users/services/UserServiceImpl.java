package com.example.demo.areas.users.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.areas.users.entities.User;
import com.example.demo.areas.users.models.binding.UpdateProfileBindingModel;
import com.example.demo.areas.users.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {		
		this.userRepository = userRepository;		
	}
	
	@Override
	public User getUserByUsername(String username) {
		
		User user = this.userRepository.findByUsername(username);
		
		return user;
	}

	@Override
	public boolean updateUser(UpdateProfileBindingModel bindingModel) {
		
		User user = userRepository.findById(bindingModel.getId());
		
		user.setName(bindingModel.getName());
		user.setEmail(bindingModel.getEmail());
		
		userRepository.saveAndFlush(user);
		
		//userRepository.deleteById(id);;
		
		return true;
	}

}
