package dsaquestions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        var(3, 4, 5, 2, 1, 5, 6, 66, 75, 43);
        int a = 12, b = 11;
        getMultiple(a, b, 3, 4, 5, 2, 1, 5, 66, 4, 43, 2, 1);
    }

    static void getMultiple(int a, int b, int... v) {
        System.out.println(Arrays.toString(v));
        System.out.println(a + " " + b);

    }

    static void var(int... v) {
        System.out.println(Arrays.toString(v));
    }

}
