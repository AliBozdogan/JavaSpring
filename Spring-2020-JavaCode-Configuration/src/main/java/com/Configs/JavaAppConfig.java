package com.Configs;

import com.interfaces.ExtraSessions;
import com.services.Java;
import com.services.OfficeHours;
import com.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com")
@PropertySource("classpath:application.properties")
public class JavaAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

 /*
    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

   */

    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
