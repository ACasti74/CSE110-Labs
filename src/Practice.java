import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String [] stringArray = {"Alex", "Pedro", "Juan"};
        int [] nums = {1,2,3,12,8,12,9,15,12};
        arrayOfInts(nums);
        findStringInArray(stringArray, "Pedro");
        duplicatesInArray(nums);

        String[] listOfProducts = {"Rice", "Beans", "Cheese"};
        Float[] priceOfProducts = {5.75f, 4.35f, 7.98f};
        String[] soldProducts = {"Rice", "Beans", "Cheese"};
        Float[] soldPriceProduct = {5.75f, 4.35f, 7.98f};

        List<String> productList = new ArrayList<>(Arrays.asList(listOfProducts));
        List<Float> productPrices = new ArrayList<>(Arrays.asList(priceOfProducts));
        List<String> productSold = new ArrayList<>(Arrays.asList(soldProducts));
        List<Float> soldPrice = new ArrayList<>(Arrays.asList(soldPriceProduct));


        int wrongsProductPrice = priceCheck(productList, productPrices, productSold, soldPrice);
        System.out.println(wrongsProductPrice);

        List<String> list = new ArrayList<>(Arrays.asList(stringArray));
        String listOfNames = stringElements(list);
        System.out.println(listOfNames.replaceAll(", $", ""));

        fibonacciSeries(10);
        reverse("NoMoreBugs!");

    }

    /**
     * Method that finds duplicates elements of type int on an array
     */
    public static int duplicatesInArray(int [] arr) {
        int duplicates = 0;
        int firstIndex;
        int secondIndex;

        for (firstIndex = 0; firstIndex < arr.length; firstIndex++) {
            for (secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
                if (arr[firstIndex] == arr[secondIndex] ) {
                    duplicates = duplicates + 1;
                }
            }
        }
        System.out.println("There are " + duplicates + " duplicates inside of the array");
        return duplicates;
    }

    /**
     * Method that prints int elements inside of an array
     */
    public static int arrayOfInts(int[] arr) {
        int index;
        int arrayOfIntegers = 0;
        for (index = 0; index < arr.length; index++) {
            arrayOfIntegers = arr[index];
            System.out.print(arr[index]);
        }
        return arrayOfIntegers;
    }

    /**
     * Method that finds an specific String inside of an array
     */
    public static void findStringInArray(String[] arr, String element) {
        int index;
        for (index = 0; index < arr.length; index++) {
            if (arr[index].equals(element)) {
                System.out.println("\nInside the array the element " + element +  " is at index: " + index);
            }
        }
    }

    /**
     * Check if the price of the product sold is the correct one
     */

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        int wrongPrice = 0;
        // loop over the list of products sold
        for (int i = 0; i < productSold.size(); i++) {
            // for each ith product sold, loop to find the product name of sold product in products list
            for (int j = 0; j < products.size(); j++) {
                if (productSold.get(i).equalsIgnoreCase(products.get(j))) {
                    if (!productPrices.get(j).equals(soldPrice.get(i)))
                        wrongPrice++;
                    break;
                }
            }
        }

        return wrongPrice; // return the number of error in selling prices
    }

    /**
     * Method that prints elements inside of a list
     */

    public static String stringElements(List<String> arr) {
        String output = "";
        int index;
        for (index = 0; index < arr.size(); index++ ) {
            output = output + arr.get(index) + ", ";
        }
        return output;
    }

    /**
     * Method that perform Fibonacci series
     */
    public static void fibonacciSeries(int count) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1 + " " + num2);

        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    /**
     * Method that prints the reverse word
     */
    public static void reverse(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i --){
            reverse = reverse + word.charAt(i);
        }
        System.out.println("\nReverse string of the word: " + word + " is: " + reverse);
    }


}
