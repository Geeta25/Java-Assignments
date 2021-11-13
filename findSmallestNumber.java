package assignmentsJava;

import java.util.Scanner;

public class findSmallestNumber {
    public static void main(String[] args) {
        //Assignment 1: Program to find smallest of four numbers(5,8,2,3).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        //Compare the four numbers to find the smallest number using conditions
        if (num1 < num2 && num1 < num3 && num1 < num4){
            System.out.println("The smallest number is: " + num1);
        }else if (num2 < num1 && num2 < num3 && num2 < num4){
            System.out.println("The smallest number is: " + num2);
        }else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println("The smallest number is: " + num3);
        }else {
            System.out.println("The smallest number is: " + num4);
        }

    }
}
