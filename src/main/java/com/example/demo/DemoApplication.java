package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SortAlgorithm sortAlgorithm = new QuickSortAlgorithmImpl();
//		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgorithm);

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int res = binarySearch.binarySearch(new int[]{5, 7, 3}, 3);
		System.out.println(res);

	}
}
