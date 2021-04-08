package com.example.demo.cdi;

import javax.inject.Named;

@Named
public class CDIExampleDAO {

    public int[] getData() {
        return new int[]{5, 20, 25};
    }

}
