package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class VisitController {
	@Autowired
	private VisitService visitservice;
	
	@GetMapping("/Visits")
	public List<VisitModel> getAllVisits(){
		
		return visitservice.getAllVisits();
		
		
	}

    @PostMapping("/addVisit")
    public void addNewVisit(@RequestBody VisitModel model){
        visitservice.addNewVisit(model);
        
    }
    
}
