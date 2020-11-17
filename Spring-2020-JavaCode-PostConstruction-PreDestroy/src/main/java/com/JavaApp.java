package com;

import com.config.JavaAppConfig;
import com.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(JavaAppConfig.class);

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();
        ((AnnotationConfigApplicationContext)container).close();

    }
}
