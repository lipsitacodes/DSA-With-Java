package dsaquestions.Sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
//        int[] a = {12, 3, 5, 23, 51, 53, 19};
        int[] a = {1,2,3,4,5,6};
        sort(a);
    }

    static void sort(int[] a) {
//        for each step , max item will come at th e last respective index
        for (int i = 0; i < a.length; i++) {
//            swap is the item is smaller than the previous item
            boolean swapped = false;
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                    swapped = true;
                }
            }
//        if you did not swap for a particular value of i , it means the array is already sorted
            if (!swapped) {
                break;
            }
        }
        System.out.println("Array after bubble sort : " + Arrays.toString(a));
    }

    static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
