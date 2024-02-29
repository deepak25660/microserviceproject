package com.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entity.User;
import com.user.service.exception.ApiError;
import com.user.service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping()
	public ResponseEntity<?> getAllUser() {
		List<User> users = userService.findAllUser();
		if (users.isEmpty())

		{
			ApiError apiError = new ApiError("There is no User", true, HttpStatus.NOT_FOUND);
			return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(users, HttpStatus.OK);

	}

	@PostMapping()
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		String message = userService.saveUser(user);

		return new ResponseEntity<>(message, HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getUserById(@PathVariable String id) throws Exception {
		User user = userService.findById(id);

		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
