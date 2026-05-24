package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle is : "+(float)area(r));
        System.out.println("Perimeter of Circle is : "+(float)peri(r));
    }

    private static double peri(double r) {
        return 2*Math.PI*r;
    }

    private static double area(double r) {
        return Math.PI * Math.pow(r,2);
    }
}
