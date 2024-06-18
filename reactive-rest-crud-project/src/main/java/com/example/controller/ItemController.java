package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Item;
import com.example.service.ItemService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public Flux<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@PostMapping
	public Mono<Item> createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	
	@GetMapping("/{name}")
	public Flux<Item> getItemsByName(@PathVariable String name) {
		return itemService.getItemsByName(name);
	}
	
	@GetMapping("/search/{id}")
	public Mono<Item> getItemById(@PathVariable String id) {
		return itemService.getItemById(id);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteItem(@PathVariable String id) {
		return itemService.deleteItem(id);
	}
	

}
