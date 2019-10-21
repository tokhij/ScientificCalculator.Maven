package com.zipcodewilmington.scientificcalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Scientific{

    public Scientific(){}

    double number1;
    double number2;



    public double findSquare(double number1){
        return number1 * number1;
    }
    //lets find square root
    public Double findSquareRoot(double number1) {
        if (number1 >= 0) {
            return Math.sqrt(number1);
        } else {System.out.println("wrong input");
         return 0000.0;}
    }
    //lets find inverse

    public Double findInverse(double number1){
        if (number1!=0){
            return 1/number1;

        }
        else{
            System.out.println("wrong input");
            return 000.0 ;
        }
    }
   //lets find switch signs
    public Double findSwitchSign(double number1)
    {
        return number1*-1;
    }
    //lets find power of the number

    public Double findPower(double number1,double number2)  {
        return Math.pow(number1,number2);
    }
    //lets find sine
    public Double findSine(double number1){
        return Math.sin(number1);
    }
     //lets find cosine
     public Double findCosine(double number1) {
         return Math.cos(number1);
     }
     //lets find tangent
    public Double findTan(double number1){
        return Math.tan(number1);
    }
}

