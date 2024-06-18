package com.example.yash.service;

import com.example.yash.model.User;

public interface UserService {
	public boolean validateUser(User user);
	public boolean registerUser(User user);
	
}
