package com.javaapp.bootstrap;

import com.javaapp.entity.Address;
import com.javaapp.entity.Person;
import com.javaapp.repository.AddressRepository;
import com.javaapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Ozzy","Crock");
        Person p3 = new Person("Tedd","Barnie");

        Address a1= new Address("King st","22012");
        Address a2= new Address("Vcad st","41231");
        Address a3= new Address("Cing st","23131");

//        p1.setAddress(Arrays.asList(a1,a2));//case -1
        personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);

    }
}
