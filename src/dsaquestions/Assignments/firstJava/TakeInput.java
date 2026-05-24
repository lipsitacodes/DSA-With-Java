package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        greet(name);
    }

     static void greet(String name) {
         System.out.println("Hello! "+name+", Welcome to Programming world");
    }
}
