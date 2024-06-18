package com.example.spring_data_jpa_demo.model.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_data_jpa_demo.Dao.CarDao;
import com.example.spring_data_jpa_demo.model.Car;

@Service
public class CarServiceImpl implements CarService {

	
	@Autowired
	CarDao dao;
	@Override
	public Optional<Car> getAllCarsById(int id) {
		
		return dao.findById(id);
	}
	@Override
	public Car addCar(Car car) {	
		return dao.save(car);
	}
	@Override
	public List<Car> getAllCars() {
		return dao.findAll();
	}
	@Override
	public Boolean deleteById(int id) {
		
		dao.deleteById(id);
		return true;
	}
	@Override
	public List<Car> findByIdGreaterThan(int id ) {
		// TODO Auto-generated method stub
		return dao.findByIdGreaterThan(id);
	}
	@Override
	public List<Car> findByIdLessThanEqual(int id) {
		
		return dao.findByIdLessThanEqual(id);
	}
	
	
	
    
}
