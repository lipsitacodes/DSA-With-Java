package dsaquestions.Assignments.functions;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        even(a);
        odd(a);
    }
    static void even(int a){
        if(a%2 == 0){
            System.out.println("It's a even number");
        }
    }
    static void odd(int a){
        if(a%2 != 0){
            System.out.println("It's a odd number");
        }
    }
}
