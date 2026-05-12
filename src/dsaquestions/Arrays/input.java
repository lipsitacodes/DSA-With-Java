package dsaquestions.Arrays;
import java.util.*;
import java.util.Arrays;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter elements to your array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();

        // array of objects

        String[] str = new String[5];

        System.out.println("Enter string for string array");

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

    }
}