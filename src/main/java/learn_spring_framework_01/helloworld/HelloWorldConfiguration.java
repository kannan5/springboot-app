package learn_spring_framework_01.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, Address address) {}
record Address(String address1, String city) {}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Kannan";
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("1st Street", "Madurai");
    }

    @Bean
    public Address address2(){
        return new Address("2st Street", "Madurai");
    }


    @Bean
    public Person NewQualifierPerson(String name, @Qualifier("add4qual") Address address){
        return new Person(name, address);
    }

    @Bean("add4")
    @Qualifier("add4qual")
    public Address address4(){
        return new Address("4st Street", "Madurai");
    }


    @Bean
    public Person NewPerson(String name, Address address) {
    	return new Person(name, address);
    }
}
