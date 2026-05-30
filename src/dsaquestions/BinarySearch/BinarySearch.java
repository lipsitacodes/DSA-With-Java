package dsaquestions.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter number to search");
        int t = sc.nextInt();

        int res = BS(arr, t);

        if (res != -1)
            System.out.println(t + " found at index " + res);
        else
            System.out.println("Element not found");
    }

    private static int BS(int[] arr, int t) {

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }
}