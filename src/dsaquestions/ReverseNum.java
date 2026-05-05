package dsaquestions;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = n;
        int res = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;

        }
        System.out.println("The reversed  number is " + res);
        if (rev == res) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");

        }

    }
}
