package learn_spring_framework_01;

import learn_spring_framework_01.game.GameRunner;
import learn_spring_framework_01.game.GamingConsole;
import learn_spring_framework_01.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new MarioGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}

//    var marioGame = new MarioGame();
//    var contraGame = new SuperContraGame();
//    var gameRunner = new GameRunner(marioGame);
//    var gameRunner2 = new GameRunner(contraGame);
//    gameRunner.Run();
//    System.out.println("----");
//    System.out.println("Mario Game Ended");
//    System.out.println("----");
//    gameRunner2.Run();
//    System.out.println("----");
//    System.out.println("Contra Game Ended");
//    System.out.println("----");
}
