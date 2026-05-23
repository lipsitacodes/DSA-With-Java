package dsaquestions.Assignments.flowcontrols;

import java.util.Scanner;

public class Lcm_Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.println("LCM of " + a + " and " + b + " is :" + LCM(a, b));
        System.out.println("HCF of " + a + " and " + b + " is :" + HCF(a, b));
    }

    static int HCF(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;

            }
        }
        return 1;
    }

    static int LCM(int a, int b) {
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                return max;
            }
            max++;
        }
    }
}
