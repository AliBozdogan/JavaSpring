package com.jpql.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "departments")
@ToString
@NamedQuery(name = "Department.findOzzyDepartment",
            query = "SELECT d FROM Department d WHERE d.division=?1")

@NamedNativeQuery(name="Department.countAllDepartments",
                    query = "SELECT * FROM departments",
                    resultClass = Department.class)
public class Department {

    @Id
    private String department;
    private String division;

//    @OneToOne(mappedBy = "department")
//    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
