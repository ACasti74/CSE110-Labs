import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Lab6.java
 * Specification: Array Data Types
 * For: CSE 110 - Lab #6
 * Time Spent: 120 minutes
 */

public class Lab6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numStudents = keyboard.nextInt();

        int studentGroups[] = new int[numStudents + 1];
        double studentGrades[] = new double[numStudents + 1];

        for(int index = 1; index <= numStudents; index++) {
            System.out.println("Enter [Group #] and [Grade] for Entry "+ index);
            studentGroups[index]= keyboard.nextInt();
            studentGrades[index]= keyboard.nextDouble();
        }

        System.out.println("=== List of Student Records ====");
        for(int i=1; i<=numStudents; i++) {
            System.out.println("Group " + studentGroups[i] + " - " + studentGrades[i] + " Points");
        }

        int groupSizes[] = new int[numStudents+1];
        double groupTotal[] = new double[numStudents+1];


        for(int index = 1; index <= numStudents; index++) {
            groupSizes[studentGroups[index]]++;
            groupTotal[studentGroups[index]] +=studentGrades[index];
        }

        System.out.println("=== Group Statistics ===");
        for(int index = 1; index <=numStudents; index++) {
            if(groupSizes[index]>0) {
                System.out.println("Group #" + index + " has "+ groupSizes[index]+ " students, average is "+ (groupTotal[index]/groupSizes[index]));
            }
        }
    }


}

