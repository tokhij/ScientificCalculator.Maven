package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScientificTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findSquareTest1() {
        //it will give the square
        Scientific square = new Scientific();
        double value1 = 5;
        double actual = value1 * value1;

        double expected = square.findSquare(value1);

        assertEquals(actual,expected,.00);
    }
    @Test
    public void findSquareTest2() {
        //it will give the square
        Scientific square = new Scientific();
        double value1 = 7.5;
        double actual = value1 * value1;

        double expected = square.findSquare(value1);

        assertEquals(actual, expected, .00);
    }

    @Test
    public void findSquareTest3() {
        //it will give the square
        Scientific square = new Scientific();
        double value1 = 45;
        double actual = value1 * value1;

        double expected = square.findSquare(value1);

        assertEquals(actual, expected, .00);
    }
    //-------------

    @Test
    public void findSquareRootTest1(){
        //it will check the square root
        Scientific squareRoot=new Scientific();
        double value1=9;
        double actual=Math.sqrt(value1);
        double expected=squareRoot.findSquareRoot(value1);
        assertEquals(actual,expected,.00);
    }
    @Test
    public void findSquareRootTest2(){
        //it will check the square root
        Scientific squareRoot=new Scientific();
        double value1=-1;
        double actual=Math.sqrt(value1);
        double expected=squareRoot.findSquareRoot(value1);
        assertNotEquals(actual,expected,.00);
    }
    @Test
    public void findSquareRootTest3(){
        //it will check the square root
        Scientific squareRoot=new Scientific();
        double value1=27;
        double actual=Math.sqrt(value1);
        double expected=squareRoot.findSquareRoot(value1);
        assertEquals(actual,expected,.00);
    }
    //-------------------

    @Test
    public void findInverseTest1(){
        //it will check the inverse
        Scientific inverse=new Scientific();
        double value1=3.0;

        double actual=1/value1;
        double expected=inverse.findInverse(value1);
        assertEquals(actual,expected,.00);
    }

    @Test
    public void findInverseTest2(){
        //it will check the inverse
        Scientific inverse=new Scientific();
        double value1=4;
        double actual=1/value1;
        double expected=inverse.findInverse(value1);
        assertEquals(actual,expected,.00);
    }
    @Test
    public void findInverseTest3(){
        //it will check the inverse
        Scientific inverse=new Scientific();
        double value1=0;
        double actual=1/value1;
        double expected=inverse.findInverse(value1);
        assertEquals(actual,expected,.00);
    }
    //---------------------

    @Test
    public void findSwitchSignTest1(){
        //it will check the switch sign
        Scientific switchSign=new Scientific();
        double value1=-4;
        double actual=value1*-1;
        double expected=switchSign.findSwitchSign(value1);
        assertEquals(actual,expected,.00);
    }
    @Test
    public void findSwitchSignTest2(){
        //it will check the switch sign
        Scientific switchSign=new Scientific();
        double value1=5;
        double actual=value1*-1;
        double expected=switchSign.findSwitchSign(value1);
        assertEquals(actual,expected,.00);
    }
    @Test
    public void findSwitchSignTest3(){
        //it will check the switch sign
        Scientific switchSign=new Scientific();
        double value1=-18.6;
        double actual=value1*-1;
        double expected=switchSign.findSwitchSign(value1);
        assertEquals(actual,expected,.00);
    }
    //---------------------------
    @Test
    public void findPowerTest1() {
        //it will check the switch sign
        Scientific power = new Scientific();
        double value1 = 4;
        double value2 = 3;

        double actual = Math.pow(value1, value2);
        double expected = power.findPower(value1, value2);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findPowerTest2() {
        //it will check the switch sign
        Scientific power = new Scientific();
        double value1 = 4;
        double value2 = 3;

        double actual = Math.pow(value1, value2);
        double expected = power.findPower(value1, value2);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findPowerTest3() {
        //it will check the switch sign
        Scientific power = new Scientific();
        double value1 = 19.2;
        double value2 = 3;

        double actual = Math.pow(value1, value2);
        double expected = power.findPower(value1, value2);
        assertEquals(actual, expected, .00);
    }
    //----------------------------
    @Test
    public void findSineTest1() {
        //it will check the switch sign
        Scientific sine = new Scientific();
        double value1 = 90;
        double actual = Math.sin(value1);
        double expected = sine.findSine(value1);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findSineTest2() {
        //it will check the switch sign
        Scientific sine = new Scientific();
        double value1 = -15;
        double actual = Math.sin(value1);
        double expected = sine.findSine(value1);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findSineTest3() {
        //it will check the switch sign
        Scientific sine = new Scientific();
        double value1 = 131.78;
        double actual = Math.sin(value1);
        double expected = sine.findSine(value1);
        assertEquals(actual, expected, .00);
    }
    //-----------------------
    @Test
    public void findCosineTest1() {
        //it will check the switch sign
        Scientific cosine = new Scientific();
        double value1 = 35;
        double actual = Math.cos(value1);
        double expected = cosine.findCosine(value1);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findCosineTest2() {
        //it will check the switch sign
        Scientific cosine = new Scientific();
        double value1 = 45;
        double actual = Math.cos(value1);
        double expected = cosine.findCosine(value1);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findCosineTest3() {
        //it will check the switch sign
        Scientific cosine = new Scientific();
        double value1 = 130.05;
        double actual = Math.cos(value1);
        double expected = cosine.findCosine(value1);
        assertEquals(actual, expected, .00);
    }
   //----------------------------
   @Test
   public void findTanTest1() {
       //it will check the switch sign
       Scientific tan = new Scientific();
       double value1 = 130.05;
       double actual = Math.tan(value1);
       double expected = tan.findTan(value1);
       assertEquals(actual, expected, .00);
   }
    @Test
    public void findTanTest2() {
        //it will check the switch sign
        Scientific tan = new Scientific();
        double value1 = 45;
        double actual = Math.tan(value1);
        double expected = tan.findTan(value1);
        assertEquals(actual, expected, .00);
    }
    @Test
    public void findTanTest3() {
        //it will check the switch sign
        Scientific tan = new Scientific();
        double value1 = 130.05;
        double actual = Math.tan(value1);
        double expected = tan.findTan(value1);
        assertEquals(actual, expected, .00);
    }
}