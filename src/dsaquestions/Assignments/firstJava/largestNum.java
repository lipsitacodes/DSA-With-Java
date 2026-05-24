package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is largest");
        }else {
            System.out.println(b+" is largest");

        }
    }
}
