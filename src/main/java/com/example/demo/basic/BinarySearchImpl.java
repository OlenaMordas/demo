package com.example.demo.basic;

import com.example.demo.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    public void postCostruct() {
        logger.info("POST CONSTRUCT");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("PRE DESTROY");
    }
}
