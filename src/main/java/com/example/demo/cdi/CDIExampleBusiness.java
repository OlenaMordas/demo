package com.example.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIExampleBusiness {

    @Inject
    CDIExampleDAO cdiExampleDAO;

    public CDIExampleDAO getCdiExampleDAO() {
        return cdiExampleDAO;
    }

    public void setCdiExampleDAO(CDIExampleDAO cdiExampleDAO) {
        this.cdiExampleDAO = cdiExampleDAO;
    }
}
