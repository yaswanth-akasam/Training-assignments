
package com.example.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.model.Item;

import reactor.core.publisher.Flux;

public interface ItemDao extends ReactiveMongoRepository<Item, String>{
	
	public Flux<Item> findByName(String name);

}
