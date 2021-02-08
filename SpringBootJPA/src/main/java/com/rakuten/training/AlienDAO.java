package com.rakuten.training;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;

public interface AlienDAO extends CrudRepository<Alien, Integer> {

	// We are passing Integer here because we have to pass primary key
	
	// SpringBoot is smart enough to detect user defined methods... e.g
	
	// List<Alien> findByName(String name);
	
	// List<Alien> findById(int id);
	
	
	
	// Not in SpringBoot
	
	// @Query("from Alien where id =? order by name")
	// List<Alien> findBySorted(Alien alien);
	
}
