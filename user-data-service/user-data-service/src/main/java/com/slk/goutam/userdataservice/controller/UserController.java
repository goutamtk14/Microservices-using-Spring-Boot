package com.slk.goutam.userdataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slk.goutam.userdataservice.entity.User;
import com.slk.goutam.userdataservice.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("/{userid}")
	public User getUserData(@PathVariable("userid") String userid) {
		System.out.println("User Called");
		int userId = Integer.parseInt(userid);
		User u = service.getUserData(userId);
		return u;

	}
}
