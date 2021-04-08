package com.example.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class CDIExampleBusiness {

    @Autowired
    CDIExampleDAO cdiExampleDAO;

    public CDIExampleDAO getCdiExampleDAO() {
        return cdiExampleDAO;
    }

    public void setCdiExampleDAO(CDIExampleDAO cdiExampleDAO) {
        this.cdiExampleDAO = cdiExampleDAO;
    }

    public int findGreatest() {
        int[] data = cdiExampleDAO.getData();
        int greatest = Integer.MIN_VALUE;

        for (int i : data) {
            if (i > greatest) {
                greatest = i;
            }
        }
        return greatest;
    }
}
