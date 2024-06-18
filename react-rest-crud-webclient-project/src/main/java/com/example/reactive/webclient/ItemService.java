package com.example.reactive.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ItemService {
	

	@Autowired
	WebClient webClient;

	
	public Flux<Item> getAllItems() {
		// TODO Auto-generated method stub
		return webClient.get()
						.uri("/items")
						.retrieve()
						.bodyToFlux(Item.class);
	}

	
	public Mono<Item> getItemById(String id) {
		// TODO Auto-generated method stub
		return webClient.get()
				.uri("/items/search/{id}", id)
				.retrieve()
				.bodyToMono(Item.class);
	}


	public Mono<Item> createItem(Item item) {
		// TODO Auto-generated method stub
		return webClient.post()
						.uri("/items")
						.bodyValue(item)
						.retrieve()
						.bodyToMono(Item.class);
	}

	
	public Mono<Void> deleteItem(String id) {
		// TODO Auto-generated method stub
		return webClient.delete()
						.uri("/items/{id}", id)
						.retrieve()
						.bodyToMono(Void.class);
	}


	public Flux<Item> getItemsByName(String name) {
		// TODO Auto-generated method stub
		return webClient.get()
						.uri("/items/{name}", name)
						.retrieve()
						.bodyToFlux(Item.class);
	}

}
