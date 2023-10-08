package com.myspring.s2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.myspring.components.s2")
public class TestSpringBootStartS2 {

	public static void main(String[] args) {
		try {
			ConfigurableApplicationContext ctx = SpringApplication.run(TestSpringBootStartS2.class, args);		
			MyCar myCar = (MyCar) ctx.getBean(MyCar.class);
			System.out.println(myCar.drive());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
