package com.reviewssite.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Reviews> reviews = new HashMap<Long, Reviews>();

	public ReviewRepository() {
		Reviews review1 = new Reviews(111L, "Brow Dip", "/images/anastasia.jpg", "Anastasia",
				"Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorum itaque ex a dignissimos necessitatibus. Reprehenderit nobis quae hic tempora voluptas, dolorum quidem expedita error, non cum quia accusamus recusandae rerum");
		Reviews review2 = new Reviews(222L, "Trophy Wife", "/images/trophywife.jpg", "Fenty Beauty",
				"Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorum itaque ex a dignissimos necessitatibus. Reprehenderit nobis quae hic tempora voluptas, dolorum quidem expedita error, non cum quia accusamus recusandae rerum");
		Reviews review3 = new Reviews(333L, "Champagne Pop", "/images/becca.jpg", "Becca",
				"Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorum itaque ex a dignissimos necessitatibus. Reprehenderit nobis quae hic tempora voluptas, dolorum quidem expedita error, non cum quia accusamus recusandae rerum");
		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
	}

	public Collection<Reviews> findAll() {
		return reviews.values();

	}

	public Reviews findOne(Long id) {
		return reviews.get(id);
	}
}
