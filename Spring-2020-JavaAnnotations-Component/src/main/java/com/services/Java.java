package com.services;

import com.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly working hours: 30");
    }
}
