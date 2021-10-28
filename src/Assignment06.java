

/**
 * Author: Alejandro Castillo
 * FileName: Assignment06.java
 * Specification: Ten Array Methods
 * For: CSE 110 - Assignment06
 * Time Spent: 120 Minutes
 */

public class Assignment06 {

    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        printArray(myArray, ", ");
        printArray(myArray, " - ");
        getFirst(myArray);
        getLast(myArray);
        getAllButFirst(myArray);
        getIndexOfMin(myArray);
        getIndexOfMax(myArray);
        swapByIndex(myArray, 1, 4);
        removeAtIndex(myArray, 3);
        insertAtIndex(myArray, 2, 777);
        isSorted(myArray);
    }

    public static void printArray(int[] arr, String separatedBy) {
        int arrayOfIntegers;
        for (int index = 0; index < arr.length - 1; index++) {
            arrayOfIntegers = arr[index];
            System.out.print(arrayOfIntegers + separatedBy);
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int getFirst(int[] arr) {
        return arr[0];
    }

    public static int getLast(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int[] getAllButFirst(int[] arr) {
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            anotherArray[i - 1] = arr[i];
        }
        return anotherArray;
    }

    public static int getIndexOfMin(int[] arr) {
        int index = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;

            }
        }
        return index;
    }

    public static int getIndexOfMax(int[] arr) {
        int index = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;

            }
        }
        return index;
    }

    public static int[] swapByIndex(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
        return arr;
    }

    public static int[] removeAtIndex(int[] arr, int index) {
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static int[] insertAtIndex(int[] arr, int index, int value) {
        int[] anotherArray = new int[arr.length + 1];
        for (int i = 0, k = 0; k < arr.length + 1; k++) {
            if (k == index) {
                anotherArray[k] = value;
                continue;
            }
            anotherArray[k] = arr[i++];
        }
        return anotherArray;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }
}
