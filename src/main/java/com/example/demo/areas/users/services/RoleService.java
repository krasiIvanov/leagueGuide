package com.example.demo.areas.users.services;

import com.example.demo.areas.users.entities.Role;

public interface RoleService {
	
	Role findByName(String name);
}
