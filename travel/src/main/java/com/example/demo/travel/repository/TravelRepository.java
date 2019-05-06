package com.example.demo.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.travel.models.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {

}
