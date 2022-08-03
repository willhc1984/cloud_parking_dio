package com.dio.cloudparking.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.cloudparking.model.Parking;

@RestController
@RequestMapping("/parking")
public class ParkingController {
	
	@GetMapping
	public List<Parking> findAll(){
		
		Parking p = new Parking(1L, "EWV-0125", "SP", "VW", "Blue", null, null, null);
		Parking p1 = new Parking(2L, "EWV-0125", "MG", "Ford", "Red", null, null, null);
		Parking p2 = new Parking(3L, "EWV-0125", "RJ", "Fiat", "Green", null, null, null);
		
		return Arrays.asList(p, p1, p2);
		
	}

}
