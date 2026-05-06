package dsaquestions;

import java.util.Arrays;

public class changeval {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 4, 5, 6, 55, 76};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num) {
        num[0] = 99;
    }
}
