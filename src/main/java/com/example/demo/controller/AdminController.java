package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.Services;

@RestController
public class AdminController {

	@Autowired
	Services se;

	
	  @RequestMapping("/")
	  public String index() { return "index.html"; }
	  
	 
	@RequestMapping("/home")
	public String result() {
		return se.finalResoult();
	}
	@RequestMapping("/result")
	public void result1() {
		 se.finalResoult1();
	}
}
