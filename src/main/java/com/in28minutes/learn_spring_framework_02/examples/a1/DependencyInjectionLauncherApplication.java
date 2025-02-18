package com.in28minutes.learn_spring_framework_02.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames())
//					.forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}

@Component
class YourBusinessClass{
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;

	@Override
	public String toString() {
		return "Using " + dependency1 +" and "+dependency2;
	}
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}
