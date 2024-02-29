package com.user.service.service;

import java.util.List;

import com.user.service.entity.User;

public interface UserService {

	List<User> findAllUser();
	
	User findById(String id) throws Exception;
	
	String saveUser(User user);
	
	
}
