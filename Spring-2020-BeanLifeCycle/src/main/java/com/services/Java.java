package com.services;

import com.interfaces.Course;

public class Java implements Course {


    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours :20");
    }

    public void myInitMethod() {
        System.out.println("Beans are initialized ");
    }

    public void myDestroyMethod() {
        System.out.println("Beans are destroyed");
    }
}
