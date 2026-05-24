package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the Sphere");
        int r = sc.nextInt();
        System.out.println("Volume of the Sphere is : " + volumeSphere(r));
    }

    static float volumeSphere(int r) {
        return (float) ((float) 4 / 3 * Math.PI * Math.pow(r, 3));
    }
}

