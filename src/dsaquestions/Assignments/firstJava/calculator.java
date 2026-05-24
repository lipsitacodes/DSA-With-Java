package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter Your Operator (+,_,/,*,%)");
        char op;
        op = sc.next().charAt(0);
        System.out.println(a + " " + op + " " + b + " = " + calc(a, b, op));
    }

    static int calc(int a, int b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 1;
        };
    }
}
