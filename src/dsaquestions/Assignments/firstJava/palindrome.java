package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int res = a;
        int rev = 0;
        while (a != 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        if (res == rev) {
            System.out.println(res + " is a palindrome number");
        } else {
            System.out.println(res + " is not a palindrome number");

        }
    }
}
