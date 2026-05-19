package dsaquestions;

import java.util.Scanner;

public class Minimum_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element into the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The smallest element of the Array is : "+MIN(arr));
    }
    static int MIN(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int j : arr) {
            if (min >= j) {
                min = j;
            }

        }
        return min;
    }
}
