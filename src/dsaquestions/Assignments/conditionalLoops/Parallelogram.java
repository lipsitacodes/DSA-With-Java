package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertical height of the Parallelogram");
        int h = sc.nextInt();
        System.out.println("Enter base of the Parallelogram");
        int b = sc.nextInt();
        int area = b * h;
        System.out.println("Area of Parallelogram is : " + area);
    }
}
