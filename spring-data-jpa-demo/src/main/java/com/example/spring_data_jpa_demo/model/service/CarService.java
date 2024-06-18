package com.example.spring_data_jpa_demo.model.service;


import java.util.List;
import java.util.Optional;

import com.example.spring_data_jpa_demo.model.Car;

public interface CarService {
   public Optional<Car> getAllCarsById(int id);
   public Car addCar(Car car);
   public List<Car> getAllCars();
   public Boolean deleteById(int id);
   public List<Car> findByIdGreaterThan(int id);
   public List<Car> findByIdLessThanEqual(int id);
}
