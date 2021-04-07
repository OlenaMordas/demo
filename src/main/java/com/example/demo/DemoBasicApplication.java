package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoBasicApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int res = binarySearch.binarySearch(new int[]{5, 7, 3}, 3);
		System.out.println(res);

	}
}
