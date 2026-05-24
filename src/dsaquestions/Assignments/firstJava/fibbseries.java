package dsaquestions.Assignments.firstJava;

import java.util.Scanner;

public class fibbseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of which you want to access the fibbonacci series");
        int a = sc.nextInt();
        System.out.println("The "+a+"th fibbonacci number is : "+fibb(a));
    }

 static int fibb(int a) {
        int x = 0,y = 1,z = 0;
     for(int i = 2;i<a;i++){
         z = x+y;
         x = y;
         y = z;
     }
     return z;
    }
}
