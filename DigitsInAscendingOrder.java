package assignmentsJava;

import java.util.Scanner;

public class DigitsInAscendingOrder {
    public static void main(String[] args) {
        //Assignment 4: For given number (int), order digits in the number in ascending order.
        //get input from keyboard

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number as input: ");
        int givenNum=sc.nextInt();
        int newNum=0;
        int temp=0;
        int numLength=0;
        int tempNum=givenNum;

        while(tempNum>0){
            numLength=numLength+1;
            tempNum=tempNum/10;
        }

        if (givenNum>0) {
            int[] array = new int[numLength];
            //populate integer array
            for (int i = (array.length) - 1; i >= 0; i--) {
                array[i] = givenNum % 10;
                givenNum=givenNum/10;
            }

            //sort array in ascending order
            for (int i = 0; i < array.length; i++) {
                for (int j=i+1;j<array.length;j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            for (int i = 0; i < array.length; i++) {
                newNum = (newNum * 10) + array[i];
            }
            System.out.println("New Sorted number in Ascending order is: " + newNum);

        }else{
            System.out.println("given number is incorrect");
        }

    }
}
