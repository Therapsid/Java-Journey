package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimArray {
    static void main() {

        int[] arr = new int[3]; // 3 -> array length
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;


        // Array initialization with values
        String[] strArr = new String[]{"A", "B", "C"};

        // Inline array initialization
        String[] strArr1 = {"A", "B", "C"};

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }


        //making dynamic array
        System.out.println("Enter new array size: ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] newArr;
        if (arraySize > arr.length) {
            newArr = new int[arraySize];
            System.arraycopy(arr, 0, newArr, 0, arr.length);// or newArr = Arrays.copyOf(arr, arraySize);
        } else throw new IllegalArgumentException("Invalid array size");

        sc.close();
        String fullOfArray = Arrays.toString(newArr); // to print whole elements of an array
        System.out.println(fullOfArray);


    }
}