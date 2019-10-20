package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScientificTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findSquareTest() {
        //it will give the square
        Scientific square = new Scientific();
        double value1 = 5;
        double actual = value1 * value1;

        double expected = square.findSquare(value1);

        assertEquals(actual,expected,.00);
    }
    @Test
    public void findSquareRootTest(){
        //it will check the square root
        Scientific squareRoot=new Scientific();
        double value1=9;
        double actual=Math.sqrt(value1);
        double expected=squareRoot.findSquareRoot(value1);
        assertEquals(actual,expected,.00);
    }
    @Test
    public void findInverseTest(){
        //it will check the inverse
        Scientific inverse=new Scientific();
        double value1=3;
        double actual=1/value1;
        double expected=inverse.findInverse(value1);
        assertEquals(actual,expected,.00);
    }
    @Test
    public void findSwitchSignTest(){
        //it will check the switch sign
        Scientific switchSign=new Scientific();
        double value1=-4;
        double actual=value1*-1;
        double expected=switchSign.findSwitchSign(value1);
        assertEquals(actual,expected,.00);
    }

}