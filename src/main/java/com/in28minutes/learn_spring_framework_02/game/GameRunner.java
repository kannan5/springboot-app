package com.in28minutes.learn_spring_framework_02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    public void Run(){
        System.out.println("Running The Game");
        game.up();
        game.down();
        game.left();
        game.right();
    }

    public GameRunner(@Qualifier("PacmanQualifier") GamingConsole consoleGame){
        this.game = consoleGame;
    }
    
}
