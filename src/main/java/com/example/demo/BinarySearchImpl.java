package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearch) {
        // sort array
        System.out.println(sortAlgorithm);
        int[] sortedNums = sortAlgorithm.sort(numbers);
        // search array
        return 3;
    }
}
