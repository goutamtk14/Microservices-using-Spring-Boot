package com.slk.goutam.mobiledataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slk.goutam.mobiledataservice.entity.Mobile;
import com.slk.goutam.mobiledataservice.service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService service;

	@RequestMapping("/{mobileid}")
	public Mobile getMobile(@PathVariable("mobileid") String mobileid) {
		System.out.println("Mobile called");
		Mobile m=service.getMobile(mobileid);
		return m;
	}
	
}
