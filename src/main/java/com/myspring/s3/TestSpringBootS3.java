package com.myspring.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myspring.components.s3")
public class TestSpringBootS3 {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TestSpringBootS3.class, args);		

	}
}
