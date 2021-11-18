import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: PizzaProgram.java
 * Specification: Program that calculate the Pizzas available form children and adults
 * For: CSE 110 - Assignment 01
 * Time Spent: 30 Minutes
 */

public class PizzaProgram {

    public static void main(String[] args) {

        int numOfPizzas, numOfSlices, adults, children;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number of pizzas purchased: ");
        numOfPizzas = keyboard.nextInt();

        System.out.print("Number of slices per pizza: ");
        numOfSlices = keyboard.nextInt();

        System.out.print("Number of adults: ");
        adults = keyboard.nextInt();

        System.out.print("Number of children: ");
        children = keyboard.nextInt();

        int totalSlices = numOfPizzas * numOfSlices;
        int numOfSlicesForAdults = adults * 2;
        int availableSlicesForChildren = totalSlices - numOfSlicesForAdults;

        int numOfSlicesForEachChild = availableSlicesForChildren / children;

        int slicesLeft = totalSlices - numOfSlicesForAdults - (numOfSlicesForEachChild * children);
        System.out.println();

        System.out.println("Total number of slices of pizza: " + totalSlices);
        System.out.println("Total number of slices given to adults: " + numOfSlicesForAdults);
        System.out.println("Total number of slices available for children: " + availableSlicesForChildren);
        System.out.println("Number of slices each child will get: " + numOfSlicesForEachChild);
        System.out.println("Number of slices left over: " + slicesLeft);

    }
}
