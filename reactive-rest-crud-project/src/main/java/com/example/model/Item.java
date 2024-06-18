package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection="db_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
	
	@Id
	private String id;
	private String name;
	private double price;

}
