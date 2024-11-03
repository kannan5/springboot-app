package com.in28minutes.learn_spring_framework_02;

import com.in28minutes.learn_spring_framework_02.sorting.AnotherComplexAlgorithm;
import com.in28minutes.learn_spring_framework_02.sorting.ComplexAlgorithm;
import com.in28minutes.learn_spring_framework_02.sorting.SortingAlgorithm;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework_02.sorting")
public class App03dot5GamingSortingAlgorithms {
    public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(App03dot5GamingSortingAlgorithms.class)){
        context.getBean(SortingAlgorithm.class).sort();
        context.getBean(ComplexAlgorithm.class).RunComplexAlgo();
        context.getBean(AnotherComplexAlgorithm.class).RunComplexAlgo();
    }
    }
}
