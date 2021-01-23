package com.cybertek.repository;

import com.cybertek.entity.Employee;
import com.cybertek.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
}
