
/**
 * Author: Alejandro Castillo
 * FileName: Assignment05.java
 * Specification: Methods
 * For: CSE 110 - Assignment05
 * Time Spent: 60 Minutes
 */

public class Assignment05 {

    public static void main(String[] args) {
        displayGreeting();
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);
        average= averageLength("test","test21", "testtest");
        System.out.println(average);
        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
        System.out.println(stars);
        stars=maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);
    }

    static void displayGreeting() {
        System.out.print("Hello, and welcome!");
    }

    static void displayText(String parameter) {
        System.out.println("\n" + parameter);
    }

    static void printTotal(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println(total);
    }

    static int getTotal(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    }

    static double getAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        return average;
    }

    static double averageLength(String param1, String param2, String param3) {
        int lengthAverages = (param1.length() + param2.length() + param3.length()) / 3;
        return lengthAverages;
    }

    static int lengthOfShortest(String param1, String param2) {
        if (param1.length() < param2.length()) {
            return param1.length();
        } else {
            return param2.length();
        }
    }

    static String stringOfStars(String parameter) {
        String star = "*";
        int i = 1;
        int parameterLength = parameter.length();
        while (i < parameterLength) {
            System.out.print(star);
            i++;
        }
        return star;
    }

    static String maxStringOfStars(String param1, String param2) {
        int param1Length = param1.length();
        int param2Length = param2.length();
        int max = Math.max(param1Length, param2Length);
        int i = 1;
        String star = "*";
        while (i < max) {
            System.out.print(star);
            i++;
        }
        return star;
    }

    static String midStringOfStars(String param1, String param2, String param3) {
        int midLength = 0;
        if (param1.length() > param2.length()) {
            if (param2.length() > param3.length())
                midLength = param2.length();
            else if (param1.length() > param3.length())
                midLength = param3.length();
            else
                midLength = param1.length();
        } else {
            if (param1.length() > param3.length())
                midLength = param1.length();
            else if (param2.length() > param3.length())
                midLength = param3.length();
            else
                midLength = param2.length();
        }
        String output = "";
        for (int i = 0; i < midLength; i++) {
            output = output + "*";
        }
        return output;
    }


}
