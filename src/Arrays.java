public class Arrays {

    public static void main(String[] args) {
        String [] stringArray = {"Alex", "Pedro", "Juan", "Alex"};
        int [] nums = {1,2,3,12,8,12,9,15,12};
        arrayOfInts(nums);
        findStringInArray(stringArray, "Pedro");
        duplicatesInArray(nums);
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

}
