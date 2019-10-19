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


        @Test
        public void subNumTest1() {
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.subNum(-10.0,10.0);
            assertEquals(Double.valueOf(-20), actual);
        }
        @Test
        public void subNumTest2(){
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.subNum(10.0,5.0);
            assertEquals(Double.valueOf(5), actual);
        }
        @Test
        public void subNameTest3(){
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.subNum(1.0,1.0);
            assertEquals(Double.valueOf(0), actual);
        }


        @Test
        public void multiNumTest1() {
            Double actual = 0.0;
            SimpleCalculator calc1 = new SimpleCalculator();
            actual = calc1.multiNum(-10.0,-10.0);
            assertEquals(Double.valueOf(-20), actual);
        }
        @Test
    public void multiNumTest2(){
        Double actual = 0.0;
        SimpleCalculator calc1 = new SimpleCalculator();
        actual = calc1.multiNum(10.0, 0.0);
        assertEquals(Double.valueOf(0), actual);
    }
    @Test
    public void multiNumTest3(){
        Double actual = 0.0;
        SimpleCalculator calc1 = new SimpleCalculator();
        actual = calc1.multiNum(5.0, 5.0);
        assertEquals(Double.valueOf(25), actual);
    }
    @Test
    public void divNumTest1(){
        Double actual = 0.0;
        SimpleCalculator calc1 = new SimpleCalculator();
        actual = calc1.divNum(5.0,5.0);
        assertEquals(Double.valueOf(1), actual);
    }
    @Test
    public void divNumTest2(){
        Double actual = 0.0;

}