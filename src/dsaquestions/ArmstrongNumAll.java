package dsaquestions;

import java.util.Scanner;

public class ArmstrongNumAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an Armstrong number or not");

        int n = sc.nextInt();
        int r = n;
        int digits = 0;

        // Count digits
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int rem, res = 0;

        // Calculate Armstrong sum
        while (n > 0) {
            rem = n % 10;
            res = res + (int) Math.pow(rem, digits);
            n = n / 10;
        }
        System.out.println(res);
        if (res == r) {
            System.out.println("Number is Armstrong number");
        } else {
            System.out.println("Number is not Armstrong number");
        }
    }
}