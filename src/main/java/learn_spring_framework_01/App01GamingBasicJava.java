package learn_spring_framework_01;

import learn_spring_framework_01.game.GameRunner;
import learn_spring_framework_01.game.MarioGame;
import learn_spring_framework_01.game.SuperContraGame;

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
