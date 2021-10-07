public class Arrays {

    public static void main(String[] args) {
        int index = 0;
        String [] stringArray = {"Alex", "Pedro", "Juan", "Alex"};
        int [] nums = {1,2,3,12,8,12,9,15,12};

        int arrayOfStringslength = stringArray.length;
        System.out.println(arrayOfStringslength);

        int arrayOfNumsLength = nums.length;
        System.out.println(arrayOfNumsLength);

        for (index = 0; index < arrayOfStringslength; index++) {
            if (stringArray[index].equals("Alex")) {
                System.out.println("Inside the array stringArray the name Alex is at index: " + index);
            }
        }

        while (index < arrayOfNumsLength) {
            if (nums[index] == 12) {
                System.out.println("Inside the array nums 12 is at index: " + index);
            }
            index++;
        }
    }
}
