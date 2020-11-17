package com.springjava.services;

import com.springjava.interfaces.Course;
import com.springjava.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${coder}")
    private String instructorName;
    @Autowired
    private ExtraSession extraSession;

    public Java(ExtraSession extraSession){
        this.extraSession = extraSession;
    }


    @Override
    public int getTeachingHours() {
        return 5 + extraSession.getHour();
    }
}
