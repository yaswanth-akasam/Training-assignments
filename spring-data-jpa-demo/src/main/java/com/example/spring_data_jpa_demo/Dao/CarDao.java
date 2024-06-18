package com.example.spring_data_jpa_demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_data_jpa_demo.model.Car;


@Repository
public interface CarDao extends JpaRepository<Car, Integer> {
   public Optional<Car> findById(int id);
   public List<Car> findByIdGreaterThan(int id);
   public List<Car> findByIdLessThanEqual(int id);
}
