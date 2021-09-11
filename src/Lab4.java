import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Lab4.java
 * Specification: Performing Arithmetic Operations
 * For: CSE 110 - Lab #4
 * Time Spent: 45 Minutes
 */

public class Lab4 {

    public static void main(String[] args) {
        int i = 4;
        int menuOption;

        while (i <= 4) {

            displayMenu();

            Scanner keyboard = new Scanner(System.in);
            menuOption = keyboard.nextInt();

            switch (menuOption) {
                case 1:
                    int option1;
                    int m;
                    int sum = 0;
                    System.out.println("Enter a number: ");
                    m = keyboard.nextInt();
                    for (option1 = 1; option1 <= m; option1++) {
                        sum = sum + option1;
                    }
                    System.out.println("The sum of 1 to " + m + " is " + sum + "\n");
                    break;

                case 2:
                    int option2;
                    int num;
                    int factorial = 1;
                    System.out.println("Enter a number: ");
                    num = keyboard.nextInt();
                    for (option2 = 1; option2 <= num; option2++) {
                        factorial = factorial *= option2;
                    }
                    System.out.println("The factorial of " + num + " is: " + factorial + "\n");
                    break;

                case 3:
                    int number;
                    System.out.println("Enter a number: ");
                    number = keyboard.nextInt();
                    int leftMost = number;
                    while (leftMost >= 10) {
                        leftMost = leftMost / 10;
                    }
                    System.out.println("The leftmost digit of " + number + " is: " + leftMost + "\n");
                    break;

                case 4:
                    System.out.println("Bye");
                    System.exit(4);
                    break;

                default:
                    System.out.println("You have provided an invalid input please try again ");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
}
