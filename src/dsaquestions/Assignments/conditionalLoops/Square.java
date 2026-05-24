package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square");
        int a = sc.nextInt();
        System.out.println("Area of Square is : "+Squarearea(a));
        System.out.println("Perimeter of Square is : "+Squareperi(a));
    }
    static int Squareperi(int a) {
        return 4*a;
    }

    static int Squarearea(int a) {
        return (int) Math.pow(a,2);
    }
}
