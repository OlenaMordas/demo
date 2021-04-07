package com.example.demo.basic;

import com.example.demo.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithmImpl implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        //logic of bubble sort
        return numbers;
    }
}
