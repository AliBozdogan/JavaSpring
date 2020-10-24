package com.services;

 import com.interfaces.ExtraSessions;
 import org.springframework.stereotype.Component;

@Component
public class PracticeHours implements ExtraSessions {


    @Override
    public int getHours() {
        return 6;
    }
}
