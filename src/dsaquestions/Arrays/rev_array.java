package dsaquestions.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static dsaquestions.Arrays.swap.Swap;

public class rev_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array you want to create");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter element into array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before reverse function");
        System.out.println(Arrays.toString(a));
        rev(a);
        System.out.println("Array after reverse function");
        System.out.println(Arrays.toString(a));
    }

    static void rev(int[] a) {
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            Swap(a, s, e);
            s++;
            e--;
        }
    }
}
