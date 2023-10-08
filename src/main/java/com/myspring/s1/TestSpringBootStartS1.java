package com.myspring.s1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myspring.components.s1")
public class TestSpringBootStartS1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TestSpringBootStartS1.class, args);
		Student student = ctx.getBean(Student.class);
		student.studentDetils();
		student.getCourse().courseDetils();
		student.getSubjects().subjectDetils();
	}

}
