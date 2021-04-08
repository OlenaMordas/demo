package com.example.demo.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CDIExampleBusinessTest {

    @Mock
    CDIExampleDAO daoMock;

    @InjectMocks
    CDIExampleBusiness exampleBusiness;

    @Test
    void findGreatest() {

        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 4});
        int res = exampleBusiness.findGreatest();
        assertEquals(4, res);
    }
}