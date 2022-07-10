package com.overone;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberGenerator {

    public int generate(int maxNum){

        Random random = new Random();
        return random.nextInt(maxNum);
    }
}
