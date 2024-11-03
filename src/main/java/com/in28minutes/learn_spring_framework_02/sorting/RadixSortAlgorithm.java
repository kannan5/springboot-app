package com.in28minutes.learn_spring_framework_02.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RadixSortAlgorithm implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Radix Sort Algorithm");
    }
}
