package dsaquestions.Sorting;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] a = {1,4,6,3,5,2};
        sort(a);
        System.out.print("Array after Cyclic sort : "+ Arrays.toString(a));
    }
    static void sort(int[] a) {
        int i = 0;

        while (i < a.length) {

            int correctIndex = a[i] - 1;

            if (a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
    }

