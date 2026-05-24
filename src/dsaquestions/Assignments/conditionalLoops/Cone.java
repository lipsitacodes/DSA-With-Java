package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the Cone");
        int r = sc.nextInt();
        System.out.println("Enter Height of the Cone");
        int h = sc.nextInt();
        System.out.println("Volume of the Cone is : "+volumeCone(r,h));
    }

     static float volumeCone(int r, int h) {
        return (float)((float) 1 /3*Math.PI*Math.pow(r,3)*h);
    }
}
