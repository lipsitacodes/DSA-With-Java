package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();

        int r = a;
        double res = 0;
        int length = 0;
        if (r == 0) {
            length = 1;
        } else {
            while (r != 0) {
                r /= 10;
                length++;
            }
        }
        r = a;
        while (a != 0) {
            int rem = a % 10;
            res = res + Math.pow(rem,length);
            a = a / 10;
        }

        if (res == r) {
            System.out.println(r + " is an Armstrong number");
        } else {
            System.out.println(r + " is not an Armstrong number");
        }
    }
}