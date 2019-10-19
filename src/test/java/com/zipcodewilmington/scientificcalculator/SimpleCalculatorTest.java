package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

        @Test
        public void addNumTest(){

            SimpleCalculator calc1 = new SimpleCalculator();
            calc1.addNum(1.0,1.0);
            assertEquals(Double.valueOf(2), calc1.addNum(1.0, 1.0));
        }
/*
        @Test
        public void subNumTest(){

            assertEquals(Integer.valueOf(1), subNum(3, 2);
        }

        @Test
        public void multiNum()
        }
        */

}