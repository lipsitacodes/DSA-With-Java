package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle");
        int l = sc.nextInt();
        System.out.println("Enter breadth of the rectangle");
        int b = sc.nextInt();
        System.out.println("Area of Rectangle is : "+area(l,b));
        System.out.println("Perimeter of Rectangle is : "+peri(l,b));

    }

     static int peri(int l, int b) {
        return 2*(l+b);
    }

     static int area(int l, int b) {
        return l*b;
    }
}
