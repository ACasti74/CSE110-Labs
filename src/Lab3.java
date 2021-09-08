import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Lab3.java
 * Specification: Conditional statements
 * For: CSE 110 - Lab #3
 * Time Spent: 60 Minutes
 */

public class Lab3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double homeworkGrade = 0;
        double midtermExam = 0;
        double finalExamGrade = 0;
        int num = 0;

        while (num <= 2) {
            if (num == 0) {
                System.out.println("Enter your homework grade: ");
                homeworkGrade = keyboard.nextDouble();

                if (homeworkGrade < 0 || homeworkGrade > 100) {
                    System.out.println("Invalid input. A final grade should be in [0, 100]. Please try again.");
                    homeworkGrade = keyboard.nextDouble();
                }

                num++;
            }

            if (num == 1) {
                System.out.println("Enter your midterm exam grade: ");
                midtermExam = keyboard.nextDouble();

                if (midtermExam < 0 || midtermExam > 100) {
                    System.out.println("Invalid input. A midterm exam grade should be in [0, 100]. Please try again.");
                    midtermExam = keyboard.nextDouble();
                }

                num++;
            }

            if (num == 2) {
                System.out.println("Enter your final exam grade: ");
                finalExamGrade = keyboard.nextDouble();

                for (int chances = 2; chances >= 0; chances--) {
                    if (finalExamGrade < 0 || finalExamGrade > 200) {
                        System.out.println("Invalid input. A final exam grade should be in [0, 200]. Please try again.");
                        System.out.println("Enter your final exam grade " + "(" + chances + " chances) left: ");
                        finalExamGrade = keyboard.nextDouble();
                        if (chances == 0) {
                            System.out.println("You have retried 3 times. Please restart your program.");
                            System.exit(0);
                        }
                    }
                }
                double totalWeighted = ((finalExamGrade) / (200 * 50)) + (midtermExam * 0.25) + (homeworkGrade * 0.25);

                if (totalWeighted >= 50) {
                    System.out.println("Student's Weighted Total is " + totalWeighted);
                    System.out.println("The student PASSED the class");
                } else {
                    System.out.println("Student's Weighted Total is " + totalWeighted);
                    System.out.println("The student FAILED the class");
                }
                break;
            }

        }
    }
}
