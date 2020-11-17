package com.springjava;

import com.springjava.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringjavaApplication {

	public static void main(String[] args) {


		ApplicationContext container = SpringApplication.run(SpringjavaApplication.class, args);

		Course course = container.getBean("java", Course.class);
		System.out.println(course.getTeachingHours());
	}

}
