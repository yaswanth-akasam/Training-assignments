package com.example.spring_data_jpa_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_data_jpa_demo.model.Car;

import com.example.spring_data_jpa_demo.model.service.CarServiceImpl;


@RestController
@RequestMapping("/car/api")
public class CarController {
	@Autowired
	CarServiceImpl service;
	
	@GetMapping("/search/{id}")
	public Optional<Car> showAllCarById(@PathVariable int id){
		return service.getAllCarsById(id);
	}
	
	@PostMapping("/add")
	public Car addCar(@RequestBody Car car) {
		return service.addCar(car);
	}
	
	@GetMapping("/display")
	public List<Car> getAllCars(){
		return service.getAllCars();
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	@GetMapping("/display/{id}")
	public List<Car> findByIdGreaterThan(@PathVariable int id){
		return service.findByIdGreaterThan(id);
	}
	
	@GetMapping("/displaylessthan/{id}")
	public List<Car> findByIdLessThanEqual(@PathVariable int id){
		return service.findByIdLessThanEqual(id);
	}
	
}
