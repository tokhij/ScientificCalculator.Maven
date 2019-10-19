package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

        @Test
        public void addNumTest1(){
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.addNum(1.0,1.0);
            assertEquals(Double.valueOf(2), actual);

            System.out.println(actual);
        }
    @Test
    public void addNumTest2(){
        Double actual = 0.0;
        SimpleCalculator calc1 = new SimpleCalculator();
        actual = calc1.addNum(-10.0,-10.0);
        assertEquals(Double.valueOf(-20), actual);

        System.out.println(actual);
    }
    @Test
    public void addNumTest3(){
        Double actual = 0.0;
        SimpleCalculator calc1 = new SimpleCalculator();
        actual = calc1.addNum(100.0,-10.0);
        assertEquals(Double.valueOf(90), actual);

        System.out.println(actual);
    }

/*
        @Test
        public void subNumTest() {
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.subNum(-10.0,-10.0);
            assertEquals(Double.valueOf(-20), actual);
        }

        @Test
        public void multiNumTest() {
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.multiNum(-10.0,-10.0);
            assertEquals(Double.valueOf(-20), actual);
        }
*/

}