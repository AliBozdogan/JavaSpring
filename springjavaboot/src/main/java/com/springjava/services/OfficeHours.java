package com.springjava.services;

import com.springjava.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    @Override
    public int getHour() {
        return 5;
    }
}
