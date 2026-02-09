package arrays;

import java.util.Arrays;

public class ArraysMethods {
    static void main() {
        //toString() -> Single Dimensional Array
        int[] arr = {1, 2, 3, 4, 5};

        //deepToString() -> Multi Dimensional Array
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        //sort() -> Ascending Order (O(n log n)) - Quicksort
        int[] arr3 = {6, 4, 11, 0, 3};
        Arrays.sort(arr3);

        //fill() -> Filling
        int[] arr4 = new int[5];
        Arrays.fill(arr4, 10); // [10, 10, 10, 10, 10]

        //binarySearch() -> Binary Search (arrays must be sorted before calling this method)
        int[] arr5 = {1, 2, 3, 4, 5};

        //equals() -> Comparing
        int[] arr6 = {1, 2, 3, 4, 5};
        int[] arr7 = {1, 2, 3, 4, 5};

        //Memory address check
        if (arr6 == arr7){
            System.out.println("Reference is different"); // never work
        }

        //Content check
        if (Arrays.equals(arr6, arr7)){
            System.out.println("Content is same");
        }

        //copyOfRange() -> Copying
        int[] arr8 = {1, 2, 3, 4, 5};
        int[] arr9 = Arrays.copyOfRange(arr8, 2, 4);



    }
}
