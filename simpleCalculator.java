package assignmentsJava;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
	/* Assignment 3: Create a simple calculator which can perform following operations with two numbers
       1.add 2.multiply 3.division 4.subtract
       Note: Program should take continuous input on what operation to perform from user. */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input details for calculation:");
        String operation = sc.nextLine();
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float output= 0;

        if (operation.equalsIgnoreCase("addition")) {
            output = addition(num1, num2);
        } else if (operation.equalsIgnoreCase("multiply")) {
            output = multiply(num1, num2);
        } else if (operation.equalsIgnoreCase("division")) {
            output = division(num1, num2);
        } else if (operation.equalsIgnoreCase("subtract")) {
            output = subtract(num1, num2);
        } else {
            System.out.println("Wrong input details entered: " + num1 + "," + num2 + "," + operation);
        }
        System.out.println("Output of"+operation+"on"+num1+" & "+num2+" is: "+output);
    }

    static float addition(float num1 , float num2){
        float operationOut = (num1+num2);
        return operationOut;
    }

    static float multiply(float num1 , float num2){
        float operationOut = (num1*num2);
        return operationOut;
    }

    static float division(float num1 , float num2){
        float operationOut = (num1/num2);
        return operationOut;
    }

    static float subtract(float num1 , float num2){
        float operationOut = (num1-num2);
        return operationOut;
    }
}
