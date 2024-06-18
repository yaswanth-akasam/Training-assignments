package com.example.service;

import com.example.model.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemService {
	
	public Flux<Item> getAllItems();
	public Mono<Item> getItemById(String id);
	public Mono<Item> createItem(Item item);
	public Mono<Void> deleteItem(String id);
	public Flux<Item> getItemsByName(String name);

}