package dsaquestions.Assignments.conditionalLoops;

import java.util.Scanner;

public class TSA_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Cube");
        int a = sc.nextInt();
        System.out.println("Total Surface Area (TSA) of Cube : "+TSA_Cube(a));
    }
    static int TSA_Cube(int a){
        return 6*(int) Math.pow(a,2);
    }
}
