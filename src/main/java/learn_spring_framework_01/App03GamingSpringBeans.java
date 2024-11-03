package learn_spring_framework_01;

import learn_spring_framework_01.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static  void main(String[] args){
    	try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GameRunner.class).Run();

    	}

    }
}
