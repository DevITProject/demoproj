package com.example.demo.servicesImpl;

import org.springframework.stereotype.Service;

import com.example.demo.services.Services;

@Service
public class ServicesImpl implements Services {

	@Override
	public String finalResoult() {
		// TODO Auto-generated method stub
	//	System.out.print("this is final result");
	
		return "this is final result";
	}

	@Override
	public void finalResoult1() {
		// TODO Auto-generated method stub
		System.out.print("this is final result");
	}

}
