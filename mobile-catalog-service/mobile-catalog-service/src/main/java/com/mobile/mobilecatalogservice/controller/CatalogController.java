package com.mobile.mobilecatalogservice.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.mobilecatalogservice.entity.Catalog;
import com.mobile.mobilecatalogservice.entity.Mobile;
import com.mobile.mobilecatalogservice.entity.Rating;
import com.mobile.mobilecatalogservice.entity.User;
import com.mobile.mobilecatalogservice.entity.UserRatings;
import com.mobile.mobilecatalogservice.service.CatalogService;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	CatalogService service;

	@RequestMapping("/{userid}")
	public Catalog getMobileCatalog(@PathVariable("userid") String userid) {
		System.out.println("Catalog called");
		User u = service.getUserInformation(userid);
		System.out.println(u.toString());
		UserRatings ratings = service.getRatings(userid);
		
		Catalog c=new Catalog();
		c.setUserid(Integer.parseInt(userid));
		c.setUsername(u.getUsername());
		c.setUsermobileno(u.getUsermobileno());
		ArrayList<Rating> list=c.getRatings();

		Rating r=new Rating();
		for (int i = 0; i < ratings.getRatings().size(); i++) {
			int mobileId = ratings.getRatings().get(i).getMobileid();
			String mobileid = mobileId + "";
			Mobile m = service.getMobileInfo(mobileid);
			r.setMobilename(m.getMobilename());
			r.setMobileprice(m.getMobileprice());
			r.setRating(ratings.getRatings().get(i).getRating());
            list.add(r);
			
		}
		c.setRatings(list);

		return c;
	}

}
