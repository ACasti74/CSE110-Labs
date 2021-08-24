import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Lab1.java
 * Specification: Program that calculate average of tests taken
 * For: CSE 110 - Lab #1
 * Time Spent: 30 Minutes
 */

public class Lab1 {

    public static void main(String[] args) {
        double test1;
        double test2;
        double test3;
        final double numberOfTests = 3.0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the score on the first test:" );
        test1 = keyboard.nextDouble();
        System.out.println("Your Test 1 score is: " + test1);

        System.out.println("Enter the score on the second test:" );
        test2 = keyboard.nextDouble();
        System.out.println("Your Test 2 score is: " + test2);

        System.out.println("Enter the score on the third test:" );
        test3 = keyboard.nextDouble();
        System.out.println("Your Test 3 score is: " + test3);

        double average;
        average = (test1 + test2 + test3) / numberOfTests;
        System.out.println("Your average score is:" + average);


    }
}
