package com.slk.goutam.userdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slk.goutam.userdataservice.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
