package dsaquestions.BinarySearch;

import java.util.Scanner;

public class OrderAgnostic {
    private static int BS(int[] arr, int t) {
        int l = 0;
        int h = arr.length - 1;
        boolean isAsc = arr[l] < arr[h];
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t)
                return mid;
            if (isAsc) {
                if (t < arr[mid])
                    h = mid - 1;
                else
                    l = mid + 1;
            } else {
                if (t > arr[mid])
                    h = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search");
        int t = sc.nextInt();
        int res = BS(arr, t);
        if (res != -1)
            System.out.println(t + " found at index " + res);
        else
            System.out.println("Element not found");
    }
}
