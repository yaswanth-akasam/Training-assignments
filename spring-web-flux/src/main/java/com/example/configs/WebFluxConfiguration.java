package com.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class WebFluxConfiguration {
    @Bean
    public RouterFunction<ServerResponse> routes(){
    	return route(
				GET("/hello"),
				request -> ServerResponse.ok().body(Mono.just("Hello web flux World"), 
				String.class)
				);
    	

    }
}
