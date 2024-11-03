package learn_spring_framework_01.game;

public class GameRunner {
    GamingConsole game;

    public void Run(){
        System.out.println("Running The Game");
        game.up();
        game.down();
        game.left();
        game.right();
    }

    public GameRunner(GamingConsole consoleGame){
        this.game = consoleGame;
    }
    
}
