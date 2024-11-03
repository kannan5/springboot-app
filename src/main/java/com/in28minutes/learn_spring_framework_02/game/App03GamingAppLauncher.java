package com.in28minutes.learn_spring_framework_02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework_02.game")
public class App03GamingAppLauncher {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(App03GamingAppLauncher.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).Run();
		}
	}
}
