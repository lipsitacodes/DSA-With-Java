package dsaquestions.Assignments.functions;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The maximum number among all the three is : "+max(a,b,c));
        System.out.println("The minimum number among all the three is : "+min(a,b,c));
    }

    static int max(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }
}
