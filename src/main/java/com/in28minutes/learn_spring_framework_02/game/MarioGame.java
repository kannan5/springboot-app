package com.in28minutes.learn_spring_framework_02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Down");
    }

    public void right(){
        System.out.println("Go Right");
    }

    public void left(){
        System.out.println("Go Left");
    }
}
