package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;

import static com.zipcodewilmington.scientificcalculator.MainApplication.addNum;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void addNumTest(){
        assertEquals(Integer.valueOf(2), addNum(1, 1));
    }

    @Test
    public void subNumTest(){

        assertEquals(Integer.valueOf(1), subNum(3, 2);
    }

    @Test
    public void multiNum()
}
