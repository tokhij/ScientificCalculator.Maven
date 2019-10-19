package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    String bob = "Name is bob";
    Integer jeff = 3;

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

        Console.println(addNum(5, 6).toString());

    }

    public static Integer addNum(Integer a, Integer b){
        return a + b;
    }

    public static Integer subNum(Integer a, Integer b){
        return a - b;
    }

    public static Integer multiNum(Integer a, Integer b){
        return a * b;
    }

    public static Integer divNum(Integer a, Integer b){
        return a / b;
    }




}
