package com.myspring.s2;

import org.springframework.stereotype.Component;

@Component
public class SedanCar implements Car{

	@Override
	public String drive() {
		System.out.println("driving sedan car");
		return "Sedan Car";
	}
	
}
