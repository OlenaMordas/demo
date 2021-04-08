package com.example.demo.basic;

import com.example.demo.DemoBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DemoBasicApplication.class)
class BinarySearchTest {

    // get bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int res = binarySearch.binarySearch(new int[]{}, 6);
        assertEquals(3, res);
    }

}