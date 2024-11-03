package learn_spring_framework_01.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
    	try(var context = 
    			new AnnotationConfigApplicationContext
    							(HelloWorldConfiguration.class)){
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("NewPerson"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("add4"));
			System.out.println(context.getBean("NewQualifierPerson"));
//			System.out.println(context.getBean(Person.class));
//			System.out.println(context.getBean(Person.class));
//			System.out.println(context.getBean(Address.class));
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    	}
    	catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    }
}
