package com.jpql.entity;

 import com.jpql.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 import lombok.ToString;

 import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "employees")
@ToString
public class Employee extends BaseEntity{

    @Column(name="first_name")
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;
    private int salary;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne//(cascade = {CascadeType.MERGE,CascadeType.PERSIST},fetch = FetchType.LAZY) it's already being isnerted before employee is created
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne//(cascade = {CascadeType.MERGE,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
    }
}
