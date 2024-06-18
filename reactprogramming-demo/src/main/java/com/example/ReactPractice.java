package com.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactPractice {
    public static void main(String[] args) {
		Flux<Integer> numbers = Flux.just(1,2,3,4,5);
		numbers.subscribe(System.out::println);
		
		Mono<Integer> number = Mono.just(1);
		number.subscribe(System.out::println);
		
		Flux<Object> transformedNumbers = numbers.map(x->x*2);
		transformedNumbers.subscribe(System.out::println);
		
	}
}
