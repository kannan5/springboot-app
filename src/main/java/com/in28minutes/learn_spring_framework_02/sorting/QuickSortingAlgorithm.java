package com.in28minutes.learn_spring_framework_02.sorting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class QuickSortingAlgorithm implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Quick Sorting Completed");
    }
}
