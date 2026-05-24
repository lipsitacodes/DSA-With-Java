package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class PTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        int p = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();
        System.out.println("Enter rate");
        int r = sc.nextInt();
        System.out.println("The Simple Interest is : " + SI(p, t, r));
    }

    static int SI(int p, int t, int r) {
        return p * t * r / 100;
    }
}
