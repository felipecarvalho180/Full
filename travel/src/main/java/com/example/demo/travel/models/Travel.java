package com.example.demo.travel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="travel")
public class Travel {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String travel;
	
	public Long getId() {
		return id;
	}
	public String getTravel() {
		return travel;
	}
	
	
	
}
