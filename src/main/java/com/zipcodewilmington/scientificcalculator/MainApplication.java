package com.zipcodewilmington.scientificcalculator;

//import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Double result;
        Double value;
        Double value1;
        Double value2;
        int operator;
        int operatorSci;
        int operatorTrig;
        int mode = 0;
        int trigMode;
        SimpleCalculator simpleCalc = new SimpleCalculator();
        Scientific scientificCalc = new Scientific();


        Console.println("Welcome to this Damn calculator!");

        while (mode == 0) {

            mode = Console.getIntegerInput("Choose mode by number: \n"
                    + "1 - Simple Calculator \n"
                    + "2 - Scientific Calculator");

            if (mode != 1 & mode != 2) {
                System.out.println("Err: Invalid Entry");
                mode = 0;
            } else {
                while (mode == 1) {

                    operator = Console.getIntegerInput("Choose operation by number: \n"
                            + "1 - Addition \n" + "2 - Subtraction \n"
                            + "3 - Multiplication \n" + "4 - Division \n"
                            + "5 - Exit to Main Menu");

                    switch (operator) {
                        case 1:
                            value1 = Console.getDoubleInput("Enter the first value.");
                            value2 = Console.getDoubleInput("Enter the second value.");
                            result = simpleCalc.addNum(value1, value2);
                            Console.println("= %f", result);
                            break;
                        case 2:
                            value1 = Console.getDoubleInput("Enter the first value.");
                            value2 = Console.getDoubleInput("Enter the second value.");
                            result = simpleCalc.subNum(value1, value2);
                            Console.println("= %f", result);
                            break;
                        case 3:
                            value1 = Console.getDoubleInput("Enter the first value.");
                            value2 = Console.getDoubleInput("Enter the second value.");
                            result = simpleCalc.multiNum(value1, value2);
                            Console.println("= %f", result);
                            break;
                        case 4:
                            value1 = Console.getDoubleInput("Enter the first value.");
                            value2 = Console.getDoubleInput("Enter the second value.");
                            result = simpleCalc.divNum(value1, value2);
                            Console.println("= %f", result);
                            break;
                        case 5:
                            mode = 0;
                            break;
                        default:
                            System.out.println("Err: Invalid Entry");
                            mode = 1;
                            break;
                    }
                }
            }

            while (mode == 2) {
                operatorSci = Console.getIntegerInput("Choose operation by number: \n" +
                        "1 - Inverse \n" + "2 - Square \n" + "3 - Square root \n" + "4 - Exponent"
                        + "5 - Trigonometric Functions" + "6 - Exit to main menu");

                switch (operatorSci) {
                    case 1:
                        value = Console.getDoubleInput("Enter your value.");
                        result = scientificCalc.findInverse(value);
                        Console.println("= %f", result);
                        break;
                    case 2:
                        value = Console.getDoubleInput("Enter your value.");
                        result = scientificCalc.findSquare(value);
                        Console.println("= %f", result);
                        break;
                    case 3:
                        value = Console.getDoubleInput("Enter your value.");
                        result = scientificCalc.findSquareRoot(value);
                        Console.println("= %f", result);
                        break;
                    case 4:
                        value1 = Console.getDoubleInput("Enter the first value.");
                        value2 = Console.getDoubleInput("Enter the second value.");
                        result = scientificCalc.EXPFUNCHERE(value1, value2);
                        Console.println("= %f", result);
                        break;
                    case 5:
                        mode = 3;
                        while (mode == 3) {
                            operatorTrig = Console.getIntegerInput("Choose operation by number: \n" +
                                    "1 - Sin \n" + "2 - Cosine \n" + "3 - Tangent \n" + "4 - Exit to main menu");
                            switch (operatorTrig) {
                                case 1:
                                    value = Console.getDoubleInput("Enter your value.");
                                    trigMode = Console.getIntegerInput("Choose mode by number: \n"
                                            + "1 - Degrees \n"
                                            + "2 - Radians");
                                    if (trigMode == 1) {
                                        result = scientificCalc.SINE DtoR FUNC (value);
                                        Console.println("= %f radians", result);
                                    } else if (trigMode == 2) {
                                        result = scientificCalc.SINEFUNC RtoD(value);
                                        Console.println("= %f degrees", result);
                                    } else {
                                        System.out.println("Err: Invalid Entry");
                                        mode = 3;
                                    }
                                    break;
                                case 2:
                                    value = Console.getDoubleInput("Enter your value.");
                                    trigMode = Console.getIntegerInput("Choose mode by number: \n"
                                            + "1 - Degrees \n"
                                            + "2 - Radians");
                                    if (trigMode == 1) {
                                        result = scientificCalc.COSINE DtoR FUNC (value);
                                        Console.println("= %f radians", result);
                                    } else if (trigMode == 2) {
                                        result = scientificCalc.COSINEFUNC RtoD(value);
                                        Console.println("= %f degrees", result);
                                    } else {
                                        System.out.println("Err: Invalid Entry");
                                        mode = 3;
                                    }
                                    break;
                                case 3:
                                    value = Console.getDoubleInput("Enter your value.");
                                    trigMode = Console.getIntegerInput("Choose mode by number: \n"
                                            + "1 - Degrees \n"
                                            + "2 - Radians");
                                    if (trigMode == 1) {
                                        result = scientificCalc.TANGENT DtoR(value);
                                        Console.println("= %f radians", result);
                                    } else if (trigMode == 2) {
                                        result = scientificCalc.TANGENT RtoD(value);
                                        Console.println("= %f degrees", result);
                                    } else {
                                        System.out.println("Err: Invalid Entry");
                                        mode = 3;
                                    }
                                    break;
                                case 4:
                                    mode = 3;
                                    break;
                                default:
                                    System.out.println("Err: Invalid Entry");
                                    mode = 2;
                                    break;

                            }
                        }
                        break;
                    case 6:
                        mode = 0;
                        break;
                    default:
                        System.out.println("Err: Invalid Entry");
                        mode = 2;
                        break;
                }
            }
        }
    }
}










