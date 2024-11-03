package com.in28minutes.learn_spring_framework_02;

import com.in28minutes.learn_spring_framework_02.game.GameRunner;
import com.in28minutes.learn_spring_framework_02.game.MarioGame;
import com.in28minutes.learn_spring_framework_02.game.SuperContraGame;

public class App01GamingBasicJava {
    public static  void main(String[] args){
        var marioGame = new MarioGame();
        var contraGame = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(contraGame);
        gameRunner.Run();
        System.out.println("----");
        System.out.println("Mario Game Ended");
        System.out.println("----");
        gameRunner2.Run();
        System.out.println("----");
        System.out.println("Contra Game Ended");
        System.out.println("----");
    }
}
