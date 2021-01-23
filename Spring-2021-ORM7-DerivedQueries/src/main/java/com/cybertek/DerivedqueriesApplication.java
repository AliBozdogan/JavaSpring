package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueriesApplication {

	@Autowired
	RegionRepository regionRepository;


	@Autowired
	DepartmentRepository departmentRepository;



	public static void main(String[] args) {
		SpringApplication.run(DerivedqueriesApplication.class, args);
	}

	@PostConstruct
	public void testRegions(){
		System.out.println("----------------------Region Start----------------------");


		System.out.println("findByCountry: "+ regionRepository.findByCountry("Canada") );
		System.out.println("findByCountry: "+ regionRepository.findDistinctByCountry("Canada") );
		System.out.println("findByCountry: "+ regionRepository.findByCountryContains("United") );
		System.out.println("findByCountry: "+ regionRepository.findByCountryContainingOrderByCountry("Asia") );
		System.out.println("findByCountry: "+ regionRepository.findTop2ByCountry("Canada") );


		System.out.println("----------------------Region Start----------------------");

	}

	@PostConstruct
	public void testDepartments(){
		System.out.println("----------------------Region Start----------------------");


		System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Toys"));
		//System.out.println(departmentRepository.);

		System.out.println("----------------------Region Start----------------------");

	}

}
