package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class RestoService {
	
@Autowired
RestoRepository restorepository;


public List<RestoModel> getAllRestos(){
	return restorepository.findAll();
}


}
