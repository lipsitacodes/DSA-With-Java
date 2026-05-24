package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        float baseArea;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base type : 1. Square ,2. Rectangle ,3. Triangle");
        String type = sc.next();
        if (type.equalsIgnoreCase("square")) {
            System.out.println("Square is selected");
            System.out.println("Enter side of the square");
            int a = sc.nextInt();
            baseArea = Square.Squarearea(a);
        } else if (type.equalsIgnoreCase("rectangle")) {
            System.out.println("Rectangle is selected");
            System.out.println("Enter length of the rectangle");
            int l = sc.nextInt();
            System.out.println("Enter breadth of the rectangle");
            int b = sc.nextInt();
            baseArea = Rectangle.area(l, b);

        } else if (type.equalsIgnoreCase("triangle")) {
            System.out.println("Triangle is selected");
            System.out.println("Enter Height of the triangle");
            int h = sc.nextInt();
            System.out.println("Enter Base of the triangle");
            int b = sc.nextInt();
            baseArea = IsoscelesTriangle.AreaTriangle(h, b);
        } else {
            System.out.println("Invalid base type");
            return;

        }
        System.out.println("Enter Height of Pyramid");
        int h = sc.nextInt();

        System.out.println("Volume of the pyramid is : " + volPyramid(baseArea, h));
        sc.close();
    }

    static float volPyramid(float baseArea, int h) {
        return baseArea * h / 3;
    }

}
