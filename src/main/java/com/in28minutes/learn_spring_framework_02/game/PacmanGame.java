package com.in28minutes.learn_spring_framework_02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanQualifier")
public class PacmanGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Pacman Up");
    }

    @Override
    public void down() {
        System.out.println("Pacman Down");
    }

    @Override
    public void left() {
        System.out.println("Pacman Left");
    }

    @Override
    public void right() {
        System.out.println("Pacman Right");
    }

}
