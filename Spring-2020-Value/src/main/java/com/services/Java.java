package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("IT")
    private String department;

    @Value("${coder}")
    private String coder;

    @Value("${days}")
    private String[] Days;


    @Override
    public String toString() {
        return "Java{" +
                "department='" + department + '\'' +
                ", coder='" + coder + '\'' +
                ", Days=" + Arrays.toString(Days)+
                '}';
    }

    //    @Autowired
//    @Qualifier("officeHours")
    ExtraSessions extraSessions;

    public Java() {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly working: "+ (30 + extraSessions.getHours() ));
    }
}
