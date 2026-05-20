package dsaquestions.Linera_Search;

import java.util.Arrays;
import java.util.Scanner;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {35, 8, 21, 5, 92},
                {11, 33, 22, 4},
                {38, 98, 77, 24},
                {133, 2},
                {39, 78, 9, 23, 13}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to search inside the array");
        int target = sc.nextInt();
        int ans[] = (seach(arr, target)); // format of return value {row,col}
        System.out.println("Element found at : " + Arrays.toString(ans));
    }

    static int[] seach(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int check = arr[i][j];
                if (check == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

