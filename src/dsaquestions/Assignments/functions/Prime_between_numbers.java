package dsaquestions.Assignments.functions;

import java.util.Scanner;

public class Prime_between_numbers {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower bound");
        a = sc.nextInt();

        System.out.println("Enter upper bound");
        b = sc.nextInt();

        System.out.println("The prime numbers between " + a + " to " + b);

        for (int i = a; i <= b; i++) {
            int result = Prime(i);

            if (result != -1) {
                System.out.print(" "+result);
            }
        }
    }

    static int Prime(int a) {
        int i = 1;
        int count = 0;

        while (i <= a) {
            if (a % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2) {
            return a;
        }

        return -1;
    }
}