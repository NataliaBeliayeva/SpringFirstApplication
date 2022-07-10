package com.overone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContextConfiguration.class);

        RandomNumberWriter rnw = ctx.getBean(RandomNumberWriter.class);
        Lottery lottery = ctx.getBean(Lottery.class);
        rnw.writeRandomNumber();
        lottery.tryToWin(5);


    }
}
