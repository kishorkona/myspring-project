package com.myspring.s2;

import org.springframework.stereotype.Component;

@Component
public class TeslaCar implements Car{

	@Override
	public String drive() {
		System.out.println("driving tesla car");
		return "Tesla Car";
	}
	
}
