package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class RestoController {
	@Autowired
	private RestoService restoservice;
	
	@GetMapping("/Restaurants")
	public List<RestoModel> getAllRestos(){
		
		return restoservice.getAllRestos();
		
		
	}

}
