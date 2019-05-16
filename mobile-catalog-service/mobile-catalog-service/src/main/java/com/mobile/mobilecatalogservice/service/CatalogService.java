package com.mobile.mobilecatalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobile.mobilecatalogservice.entity.Mobile;
import com.mobile.mobilecatalogservice.entity.User;
import com.mobile.mobilecatalogservice.entity.UserRatings;

@Service
public class CatalogService {
	
//	@Autowired
//	WebClient.Builder builder;
	
	@Autowired
	RestTemplate rest;
	
	public User getUserInformation(String userid) {

//		User u=builder.build().get().uri("http://user-data-service/"+userid).retrieve().bodyToMono(User.class).block();
		User u=rest.getForObject("http://user-data-service/"+userid, User.class);
		
		return u;
	}
	
	
	public  UserRatings getRatings(String userid) {
//		UserRatings u=builder.build().get().uri("http://ratings-service/"+userid).retrieve().bodyToMono(UserRatings.class).block();
		
		UserRatings u=rest.getForObject("http://ratings-service/"+userid, UserRatings.class);
		return u;
	}

	public Mobile getMobileInfo(String mobileid) {
		
//		Mobile m=builder.build().get().uri("http://mobile-data-service/"+mobileid).retrieve().bodyToMono(Mobile.class).block();
		Mobile m=rest.getForObject("http://mobile-data-service/"+mobileid, Mobile.class);
		return m;
	}
}
