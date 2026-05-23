package dsaquestions.Assignments.flowcontrols;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("The Sum : "+Sum(a,b));
    }

   static int Sum(int a, int b) {
        return a+b;
    }
}
