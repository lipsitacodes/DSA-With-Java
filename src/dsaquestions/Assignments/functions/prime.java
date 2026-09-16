package dsaquestions.Assignments.functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        Prime(a);
    }
    static void Prime(int a){
        int i = 1;
        int count = 0;
        while(i<=a){
            if(a%i == 0){
                count++;
            }
            i++;
        }
        if(count == 2){
            System.out.println("it's a prime number");
        }else{
            System.out.println("it's a composite number");

        }
    }
}
