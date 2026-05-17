package dsaquestions.Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {11, 3, 5, 6, 66};
        System.out.println("Array before swapping");
        System.out.println(Arrays.toString(arr));
        Swap(arr, 1, 3);
        System.out.println("Array after swapping");
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
