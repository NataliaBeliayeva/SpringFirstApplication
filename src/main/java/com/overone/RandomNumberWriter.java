package com.overone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberWriter {

    @Autowired
    private RandomNumberGenerator numberGenerator;

    public void writeRandomNumber(){

        System.out.println("Random number = " + numberGenerator.generate(100));
    }
}
