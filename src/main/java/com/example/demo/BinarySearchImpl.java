package com.example.demo;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
        // sort array
        System.out.println(sortAlgorithm);
        int[] sortedNums = sortAlgorithm.sort(numbers);
        // search array
        return 3;
    }
}
