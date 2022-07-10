package com.overone;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Lottery {

    @Resource(name = "randomNumberGenerator")
    private RandomNumberGenerator numberGenerator;

    public void tryToWin (int number){
        int winNumber = numberGenerator.generate(5);
        if (number == winNumber) {
            System.out.println("Поздравляем! Выигрышное число = " + winNumber);
        }
        else {
            System.out.println("Повезет в следующий раз");
        }
    }
}
