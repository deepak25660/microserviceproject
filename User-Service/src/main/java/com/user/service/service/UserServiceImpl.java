package com.user.service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.entity.Rating;
import com.user.service.entity.User;
import com.user.service.exception.ResourceNotFoundException;
import com.user.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate resrRestTemplate;
	
	@Override
	public List<User> findAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User findById(String id) throws Exception {
	  User user = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("id not present"));
	  String us=user.getId();
	  List<Rating> ratings=resrRestTemplate.getForObject("http://localhost:8383/Rating/user/"+us, ArrayList.class);
	  user.setRatings(ratings);
		return user;
	}

	@Override
	public String saveUser(User user) {
	
		String uuid= UUID.randomUUID().toString();
		user.setId(uuid);
		userRepository.save(user);
		return "User Is Created";
	}

}
