import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Lab2.java
 * Specification: String Methods
 * For: CSE 110 - Lab #2
 * Time Spent: 30 Minutes
 */

public class Lab2 {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        String fullName;
        int fullNameLength;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter first name:");
        firstName = keyboard.nextLine();

        System.out.println("Please enter last name:");
        lastName = keyboard.nextLine();

        fullName = firstName + " " + lastName;
        System.out.println("Full name (in capitals): " + fullName.toUpperCase());

        fullNameLength = fullName.length();
        System.out.println("Length of full name: " + fullNameLength);

        if (firstName == lastName) {
            System.out.println("String comparison using \"==\" sign works");
        } else {
            System.out.println("String comparison using \"==\" sign does NOT work");
        }

        if (fullName.equals(firstName + " " + lastName)){
            System.out.println("String comparison using \"equals\" method works");
        } else {
            System.out.println("String comparison using \"equals\" method does NOT work");
        }




    }
}
