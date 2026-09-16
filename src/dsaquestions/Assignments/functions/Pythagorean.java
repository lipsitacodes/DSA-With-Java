package dsaquestions.Assignments.functions;

import java.util.Scanner;

import static dsaquestions.Assignments.functions.min_max.max;


public class Pythagorean {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        triplet(a, b, c);
    }

    static void triplet(int a, int b, int c) {
        int maximum = max(a, b, c);
        double t;
        if (a == maximum) {
            t = Math.pow(b, 2) + Math.pow(c, 2);
        } else if (b == maximum) {
            t = Math.pow(a, 2) + Math.pow(c, 2);

        } else {
            t = Math.pow(a, 2) + Math.pow(b, 2);

        }
        if (t == maximum * maximum) {
            System.out.println("The given triplet is a Pythagorean triplet");
        } else {
            System.out.println("The given triplet is not a Pythagorean triplet");

        }
    }
}
