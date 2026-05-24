package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height of the triangle");
        float h = sc.nextInt();
        System.out.println("Enter Base of the triangle");
        float b = sc.nextInt();
        System.out.println("Area of Isosceles Triangle is : "+ AreaTriangle(h,b));
    }
    static float AreaTriangle(float h, float b){
        return (float) 1 /2*(h*b);
    }
}
