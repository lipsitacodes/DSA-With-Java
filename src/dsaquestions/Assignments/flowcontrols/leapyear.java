package dsaquestions.Assignments.flowcontrols;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int year = sc.nextInt();
        System.out.println("Is "+year+" a Leap Year : "+checkLeap(year));

    }

     static boolean checkLeap(int year) {
         return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
