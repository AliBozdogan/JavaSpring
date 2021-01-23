package com.jpql.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "regions")
@ToString
public class Region extends BaseEntity {

    private String region;
    private String country;
//
//    @OneToOne(mappedBy = "region")
//    private Employee employee;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }

}
