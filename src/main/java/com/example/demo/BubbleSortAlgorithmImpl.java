package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithmImpl implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        //logic of bubble sort
        return numbers;
    }
}
