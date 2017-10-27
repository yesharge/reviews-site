package com.reviewssite.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class ReviewRepository {

	protected Map<Long, Reviews> reviews = new HashMap<Long, Reviews>();

	public ReviewRepository() {
		Reviews review1 = new Reviews(111L, "Never Again", "/images/jamesbond.jpg", "Anastasia",
				"Never again will I watch another James Bond movie");
		Reviews review2 = new Reviews(222L, "Trophy Wife", "/images/trophywife.jpg", "Fenty Beauty",
				"I looveeee Rihanna's new highlight. Can see my highlight from space. Will buy again. ");
		Reviews review3 = new Reviews(333L, "Trophy Wife", "/images/trophywife.jpg", "Fenty Beauty",
				"I looveeee Rihanna's new highlight. Can see my highlight from space. Will buy again. ");
	reviews.put(review1.getId(), review1);
	reviews.put(review2.getId(), review2);
	reviews.put(review3.getId(), review3);
	}
	public Collection<Reviews> findAll() {
		return reviews.values();
		
	}
	public Reviews findOne (Long id) {
		return reviews.get(id);
	}
}
