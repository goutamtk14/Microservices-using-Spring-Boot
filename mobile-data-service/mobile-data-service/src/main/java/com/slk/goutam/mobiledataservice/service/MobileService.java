package com.slk.goutam.mobiledataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.goutam.mobiledataservice.entity.Mobile;
import com.slk.goutam.mobiledataservice.repository.MobileRepository;

@Service
public class MobileService {
	
	@Autowired
	MobileRepository repo;
	
	public Mobile getMobile(String mobileId) {
		int mobileid=Integer.parseInt(mobileId);
		Mobile m=repo.findById(mobileid).orElse(null);
		return m;
		
	}

}
