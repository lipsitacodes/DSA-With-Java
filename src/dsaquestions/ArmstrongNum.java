package dsaquestions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number to check is a number Armstrong number or not");
        int rem = 0,res = 0;
        int n = sc.nextInt();
        int r = n;
        while(n>0){
            rem = n%10;
            res = res+rem*rem*rem;
            n = n/10;
        }
        System.out.println(res);
        if(res == r){
            System.out.println("Number is Armstrong number");
        }else{
            System.out.println("Number is not Armstrong number");

        }
    }
}
