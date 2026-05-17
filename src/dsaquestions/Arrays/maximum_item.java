package dsaquestions.Arrays;

import java.util.Scanner;

public class maximum_item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array you want to create");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter element into array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The largest element in the array is : "+max(a));
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= m) {
                m = arr[i];
            }
        }
        return m;
    }
}
