package dsaquestions.Sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 1, 6, 7, 5};
        sort(a);
    }

    static void sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
//            find max in the remaining array and swap with it's correct index
            int end = a.length - i - 1;
            int max = maxIndex(a, end);
            temp = a[max];
            a[max] = a[end];
            a[end] = temp;
        }
        System.out.println("Array after applying selection sort: " + Arrays.toString(a));
    }

    static int maxIndex(int[] a, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (a[max] < a[i]) {
                max = i;
            }
        }
        return max;
    }
}
