package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the Cylinder");
        int r = sc.nextInt();
        System.out.println("Enter Height of the Cylinder");
        int h = sc.nextInt();
        System.out.println("Volume of the Cylinder is : " + volumeCylinder(r, h));
        System.out.println("Curved Surface Area of the Cylinder is : " + CSA_Cylinder(r, h));
    }

    static float CSA_Cylinder(int r, int h) {
        return (float) (2 * Math.PI * r * h);
    }

    static float volumeCylinder(int r, int h) {
        return (float) (Math.PI * Math.pow(r, 2) * h);
    }

}

