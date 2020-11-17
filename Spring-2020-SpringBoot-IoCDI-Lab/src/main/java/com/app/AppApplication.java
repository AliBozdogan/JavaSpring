package com.app;

import com.app.enums.City;
import com.app.interfaces.Services.calculator.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) throws Exception{

		ApplicationContext container = SpringApplication.run(AppApplication.class, args);

		Calculator calculator = container.getBean("calculator",Calculator.class);

		System.out.println(calculator.getTotalCarpetCost(City.DALLAS));
	}

}
