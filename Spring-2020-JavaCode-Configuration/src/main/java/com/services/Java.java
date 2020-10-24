package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class Java implements Course {

    private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: " + (30 + extraSessions.getHours()) + " coder name: " + this.coder);
    }

    @Value("IT")
    private  String department;

    @Value("${coder}")
    private String coder;

    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "department='" + department + '\'' +
                ", coder='" + coder + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
