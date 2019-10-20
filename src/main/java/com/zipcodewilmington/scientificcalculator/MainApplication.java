package com.zipcodewilmington.scientificcalculator;

//import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Double result;
        //boolean checkInput = true;
        SimpleCalculator simpleCalc = new SimpleCalculator();
        Scientific scientificCalc = new Scientific();
        Console.println("Welcome to this Damn calculator!");
        String mode = "0";

        while (mode.equals("0")) {
            mode = Console.getStringInput("Choose the number mode: \n" + "1 - Simple Calculator \n" + "2 - Scientific Calculator");

            while (mode.equals("1")) {

                Integer operator = Console.getIntegerInput("Choose your operation: (+, -, *, /); \n" + "5 - Exit to Main Menu");
                if (operator == 5) {
                    mode = "0";
                    break;
                }
                Double value1 = Console.getDoubleInput("Enter the first value.");
                Double value2 = Console.getDoubleInput("Enter the second value.");


                switch(operator)
                {
                    case 1:
                        result = simpleCalc.addNum(value1, value2);
                        Console.println("%f + %f = %f", value1, value2, result);
                        break;
                    case 2:
                        result = simpleCalc.subNum(value1, value2);
                        Console.println("%f - %f = %f", value1, value2, result);
                        break;
                    case 3:
                        result = simpleCalc.multiNum(value1, value2);
                        Console.println("%f * %f = %f", value1, value2, result);
                        break;
                    case 4:
                        result = simpleCalc.divNum(value1, value2);
                        Console.println("%f / %f = %f", value1, value2, result);
                        break;
                    default:
                    break;
                }

            }

            while (mode.equals("2")) {
                Integer operatorSci = Console.getIntegerInput("Choose your operation: \n" +
                        "1 - Inverse \n" + "2 - Square \n" + "3 - Square root \n" + "4 - Exit to main menu");

                if (operatorSci == 0) {
                    mode = "0";
                    break;
                }
                Double value = Console.getDoubleInput("Enter your value.");

                switch (operatorSci) {
                    case 1:
                        result = scientificCalc.findInverse(value);
                        Console.println("%f", result);
                        break;
                    case 2:
                        result = scientificCalc.findSquare(value);
                        Console.println("%f", result);
                        break;
                    case 3:
                        result = scientificCalc.findSquareRoot(value);
                        Console.println("%f", result);
                        break;
                    case 4:
                        mode = "0";
                        break;
                    default:
                        break;
                }
            }
        }

    }
}







