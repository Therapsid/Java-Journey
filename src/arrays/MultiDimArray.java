package arrays;

public class MultiDimArray {
    static void main() {
        int[][] arr = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        // 10, 20, 30 -> 0 index
        // 40, 50, 60 -> 1 index

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}
