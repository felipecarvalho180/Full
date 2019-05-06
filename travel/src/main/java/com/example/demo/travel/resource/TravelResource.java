package com.example.demo.travel.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.travel.models.Travel;
import com.example.demo.travel.repository.TravelRepository;

@RestController
@RequestMapping("/travel")
public class TravelResource {
	
	@Autowired
	private TravelRepository repositorio;
	
	@GetMapping
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Travel>> getAll() {
		List<Travel> travel = repositorio.findAll();
		return ResponseEntity.ok(travel);
	}
}
