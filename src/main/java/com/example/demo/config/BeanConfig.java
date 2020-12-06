package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BeanConfig {
	
	@Bean
	public ModelMapper createMapper() {
		
		return new ModelMapper(); 
	}
	
	@Bean
    BCryptPasswordEncoder getEncoder(){

        return  new BCryptPasswordEncoder();
    }

}
