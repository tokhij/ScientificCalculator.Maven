package com.zipcodewilmington.scientificcalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Scientific{

    public Scientific(){}

    double number;


    public double findSquare(double number){
        return number * number;
    }
    //lets find square root
    public Double findSquareRoot(double number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else System.out.println(".");
            return null;
    }
    //lets find inverse
    public Double findInverse(double number){
        if (number!=0){
            return 1/number;
        }
        else return null;
    }
   //lets find switch signs
    public Double findSwitchSign(double number){
        return number*-1;
    }
    //lets accept mode
  /*  import java.io.BufferedReader;
    import java.io.InputStreamReader;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    float i = float.parseFloat(s);
*/
}

