package com.myspring.s2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyCar {

	//@Qualifier("sedanCar")
	@Autowired
	Car teslaCar; // default byType
	
	public String drive() {
		return teslaCar.drive();
	}
}
