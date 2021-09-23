import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Lab5.java
 * Specification: Design Patterns by Loops
 * For: CSE 110 - Lab #5
 * Time Spent: 120 minutes
 */

public class Lab5 {

    public static void main(String[] args) {

        boolean flag = true;
        char sideSymbol = '-';
        char midSymbol = '*';

        while (flag) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please choose the pattern from list:");
            System.out.println("r) Row");
            System.out.println("p) Pyramid");
            System.out.println("d) Shallow diamond");
            System.out.println("q) Quit");
            char ch = keyboard.next().charAt(0);

            switch (ch) {
                case 'r': {

                    System.out.println("Width of the sides ?");
                    int sideWidth = keyboard.nextInt();
                    System.out.println("Width of the middle?");
                    int midWidth = keyboard.nextInt();

                    buildRow(sideSymbol, sideWidth, midSymbol, midWidth);

                    break;
                }

                case 'p': {

                    System.out.println("Number of Symbols in lowest layer?");
                    int ptnHeight = keyboard.nextInt();

                    buildPyramid(sideSymbol, midSymbol, ptnHeight);

                    break;
                }

                case 'd': {

                    System.out.println("Number of Symbols in middle layer?");
                    int n = keyboard.nextInt();
                    int rows = (n - 1) / 2;

                    for (int i = 1; i <= rows; i++) {
                        for (int j = i; j <= rows; j++) {
                            System.out.print("*");
                        }
                        for (int k = 0; k <= i * 2 - 2; k++) {
                            System.out.print(" ");
                        }
                        for (int l = i; l <= rows; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 1; i <= rows; i++) {

                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        for (int k = i * 2 - 2; k <= rows * 2 - 2; k++) {
                            System.out.print(" ");
                        }
                        for (int l = 1; l <= i; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                }

                case 'q':
                    System.out.println("Bye");
                    flag = false;
                    break;
            }
            System.out.println();
        }
    }

    public static void buildRow(char sideSymbol, int sideWidth, char midSymbol, int midWidth) {

        for (int i = 0; i < sideWidth; i++) {
            System.out.print(sideSymbol);
        }
        for (int i = 0; i < midWidth; i++) {
            System.out.print(midSymbol);
        }
        for (int i = 0; i < sideWidth; i++) {
            System.out.print(sideSymbol);
        }
    }
    public static void buildPyramid(char sideSymb, char midSymb, int ptnHeight) {
        int rows, cnt;

        if (ptnHeight % 2 == 0) {
            System.out.println("The input is not an odd number. Use the closest odd number below " + ptnHeight);
            rows = (ptnHeight - 2) / 2;
            cnt = rows + 1;
        } else {
            rows = (ptnHeight + 1) / 2;
            cnt = rows;
        }
        for (int i = 1; i <= rows; i++) {

            for (int j = cnt; j > i; j--) {
                System.out.print(sideSymb);
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(midSymb);
            }
            for (int j = cnt; j > i; j--) {
                System.out.print(sideSymb);
            }
            System.out.println();
        }
    }
}
