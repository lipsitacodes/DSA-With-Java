package dsaquestions.Assignments.flowcontrols;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of which you want to print it's table");
        int a = sc.nextInt();
        System.out.println("Table of "+a);
        Table(a);
    }

    static void Table(int a) {
        for (int i = 1; i <= 10; i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
