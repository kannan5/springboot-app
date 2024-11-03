package com.in28minutes.learn_spring_framework_02.game;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Contra Jump");
    }

    public void down(){
        System.out.println("Contra Down");
    }

    public void right(){
        System.out.println("Contra Go Right");
    }

    public void left(){
        System.out.println("Contra Go Left");
    }
}
