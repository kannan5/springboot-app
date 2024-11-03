package com.in28minutes.learn_spring_framework_02.sorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherComplexAlgorithm {
    @Autowired @Qualifier("radixSortAlgorithm")
    private SortingAlgorithm sortingAlgorithm;

    public void RunComplexAlgo(){
        System.out.println("2. Started Running Another Complex Algorithm");
        this.sortingAlgorithm.sort();
    }

    // Since Autowired Property was added we dont need to initialize constructor.
//    public AnotherComplexAlgorithm(SortingAlgorithm sortingAlgorithm){
//        this.sortingAlgorithm = sortingAlgorithm;
//    }
}
