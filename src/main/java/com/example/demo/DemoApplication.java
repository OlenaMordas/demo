package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SortAlgorithm sortAlgorithm = new QuickSortAlgorithmImpl();
		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgorithm);
		int res = binarySearch.binarySearch(new int[]{5, 7, 3}, 3);
		System.out.println(res);

		SpringApplication.run(DemoApplication.class, args);
	}
}
