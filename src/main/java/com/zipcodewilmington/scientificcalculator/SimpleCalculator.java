package com.zipcodewilmington.scientificcalculator;

import java.awt.*;

public class SimpleCalculator {


    public SimpleCalculator() {
    }


    public static Double addNum(Double a, Double b) {

        return a + b;
    }

    public static Double subNum(Double a, Double b) {

        return a - b;
    }

    public static Double multiNum(Double a, Double b) {

        return a * b;
    }

    public static Double divNum(Double a, Double b) {


        if (b == 0) {
            Console.println("Damn, Don't / by zero");
            return 0000.0;
        } else {return a / b;}

    }
}


