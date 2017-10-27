package com.reviewssite.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.springpractice.springpractice.CourseTopic;

@Component
public class ReviewRepository {

	protected Map<Long, Reviews> reviews = new HashMap<Long, Reviews>();

	public ReviewRepository() {
		Reviews review1 = new Reviews(111, "Never Again", "", "Movies",
				"Never again will I watch another James Bond movie");
		Reviews review2 = new Reviews(222, "Trophy Wife", "", "Makeup",
				"I looveeee Rihanna's new highlight. Can see my highlight from space. Will buy again. ");
	reviews.put(review1.getId(), review1);
	reviews.put(review2.getId(), review2);
	}
	public Collection<Reviews> findAll() {
		return reviews.values();
		
	}
	public Reviews findOne (Long id) {
		return reviews.get(id);
	}
}
