package com.in28minutes.learn_spring_framework_02.sorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexAlgorithm {
    @Autowired
    private SortingAlgorithm sortingAlgorithm;

    public void RunComplexAlgo(){
        System.out.println("1. Started Running Complex Algorithm");
        this.sortingAlgorithm.sort();
    }

    // Since Autowired Property was added we dont need to initialize constructor.
//    public ComplexAlgorithm(SortingAlgorithm sortingAlgorithm){
//        this.sortingAlgorithm = sortingAlgorithm;
//    }
}
