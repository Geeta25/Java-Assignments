package assignmentsJava;

import java.util.Scanner;

public class checkCharCase {
    public static void main(String[] args) {
        //Assignment 2: Program to check whether a entered character is lowercase (a to z) or uppercase(A to Z).
        //As we haven't exposed Arrays yet.. above can be resolved using conditions alone.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character as input: ");
        char c=(sc.nextLine()).charAt(0);
        if (c>=65 && c<=90) {
            System.out.println("Entered character is Uppercase: " +"\""+c+"\"");
        }
        else if(c>=97 && c<=122){
            System.out.println("Entered character is Lowercase: " +"\""+c+"\"");
        }
    }
}
