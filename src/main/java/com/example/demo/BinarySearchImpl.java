package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm quickSortAlgorithmImpl;

    public int binarySearch(int[] numbers, int numberToSearch) {
        // sort array
        System.out.println(quickSortAlgorithmImpl);
        int[] sortedNums = quickSortAlgorithmImpl.sort(numbers);
        // search array
        return 3;
    }
}
