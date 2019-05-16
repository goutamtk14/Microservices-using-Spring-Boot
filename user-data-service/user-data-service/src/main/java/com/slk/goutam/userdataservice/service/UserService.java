package com.slk.goutam.userdataservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.goutam.userdataservice.entity.User;
import com.slk.goutam.userdataservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User getUserData(int userId) {
		
		User u=repo.findById(userId).orElse(new User(10,"Goutam",9008670092L));
		return u;
		
		
		
	}

}
