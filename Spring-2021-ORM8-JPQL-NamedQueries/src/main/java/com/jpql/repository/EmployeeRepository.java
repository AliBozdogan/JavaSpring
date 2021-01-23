package com.jpql.repository;

import com.jpql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("Select e from Employee e where e.email='btrow5@technorati.com'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee e WHERE e.email ='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    //single bind parameter
    @Query("select e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeByEmail(String email);

    //multiple bind parameter
    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Employee getEmployeeByEmailAndSalary(String email,int salary);


    //single named parameter
    @Query("Select e FROM Employee e WHERE e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary")int salary);

    //multiple name parameters
    @Query("SELECT e FROM Employee e WHERE e.firstName=:name OR e.salary=:salary")
    List<Employee> getEmployeeByFirstNameOrSalary(@Param("name")String name,@Param("salary")int salary);

    //Not equal
    @Query("SELECT e FROM Employee e WHERE e.salary<> ?1")
    List<Employee> getEmployeeBySalaryNotEqual(int salary);

    //Like / Contains / StartsWith / EndsWith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> getEmployeeByFirstNameLike(String patter);

    //Less Than
    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeeBySalaryLessThan(int salary);

    //Greater Than
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeeBySalaryGreaterThan(int salary);

    //Between
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeBySalaryBetween(int salary1,int salary2);

    //Before
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> getEmployeeByHireDateBefore(LocalDate localDate);

    //Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> getEmployeeByEmailIsNull();

    //Not Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> getEmployeeByEmailIsNotNull();

    //Sort Salary in ascending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> getEmployeeBySalaryOrderByAsc();

    //Sort Salary in descending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> getEmployeeBySalaryOrderByDesc();

    //Native Query
    @Query(value = "SELECT * FROM employees WHERE salary = ?1", nativeQuery = true)
    List<Employee> readEmployeeBySalary(int salary);

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.email = 'admin@email.com' WHERE e.id=:id")
    void updateEmployeeJPQR(@Param("id")Integer id);

    @Query(value = "UPDATE employees SET email='admin@email.com' WHERE id=:id",nativeQuery = true)
    void updateEmployeeNativeQuery(@Param("id")Integer id);

    //Named Query
    List<Employee> retrieveEmployeeSalaryGreaterThan(Integer salary);
}
