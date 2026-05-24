package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Rhombhus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal 1 of the Rhombus");
        float d1 = sc.nextFloat();
        System.out.println("Enter diagonal 2 of the Rhombus");
        float d2 = sc.nextFloat();
        float area = (float) 1/2 * d1 * d2;
        System.out.println("Area of Rhombus is : "+area);
    }
}
