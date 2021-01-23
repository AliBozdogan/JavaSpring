package com.orm2;

import com.orm2.entity.Car;
import com.orm2.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrmconfigApplication {

	@Autowired
	CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmconfigApplication.class, args);
	}

	@PostConstruct
	public void dataInit(){
		Car c1 = new Car("BMW","M5");
		Car c2 = new Car("Kia","ada");
		Car c3 = new Car("Mercedes","23123");

		carRepository.save(c1);
		carRepository.save(c2);
		carRepository.save(c3);

	}
}
