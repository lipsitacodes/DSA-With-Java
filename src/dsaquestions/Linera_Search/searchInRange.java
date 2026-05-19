package dsaquestions.Linera_Search;

import java.util.Scanner;

public class searchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element into the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number you want to search");
        int k = sc.nextInt();
        System.out.println("Element found at index : " + Linear(arr, k,1,4));
    }

    public static int Linear(int[] arr, int t,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            int check = arr[i];
            if (check == t) {
                return i;
            }
        }
        return -1;
    }
}

