package dsaquestions.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //mentioning the size of rows is mandatory but for columns it's not even mandatory

        int[][] arr2d = {
                {2, 3, 5},
                {1, 4},
                {23, 64, 23, 64, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        /*

        So many ways to print the array in java
        for (int[] ints : arr) {
                System.out.print("[");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
                System.out.print("]");
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
         */
        for (int[] e : arr){
            System.out.println(Arrays.toString(e));
        }

    }
}
