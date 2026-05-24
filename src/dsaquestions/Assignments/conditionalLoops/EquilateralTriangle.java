package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square");
        int a = sc.nextInt();
        int p = 3*a;
        float area = (float) ((float) Math.sqrt(3)/4 * Math.pow(a,2));
        System.out.println("Area of Equilateral Triangle is : "+area+" , Perimeter of Equilateral Triangle is : "+p);
    }
}
