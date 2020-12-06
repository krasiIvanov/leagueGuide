package com.example.demo.constants;

public interface ConfigConstants {
	
	//Web Security Configuration constants
    String FormLoginPage = "/login";
    String FormLogoutPage = "/logout";
    String UsernameParameter = "username";
    String PasswordParameter = "password";
    String AccessDeniedPage = "/error/403";
    String AuthEntryPoint = "/user/login";
    String RememberMeKey="rememberMeKey";
    String RememberMeParameter="rememberMe";
    String CookieName="cookie";
    int TokenValidation = 10000;
}
