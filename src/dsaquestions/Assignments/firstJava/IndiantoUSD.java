package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class IndiantoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a amount in indian ruppes");
        int a = sc.nextInt();
        System.out.println(a+" in USD Currency : "+USD(a));
    }

     static double USD(int a) {
        return a/85.0;
    }
}
