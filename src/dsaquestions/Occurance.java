package dsaquestions;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to calculate the number of occurance of given number sting");
//        String str = sc.nextLine();
//        int c = 0;
//        for(int i = 0;i<str.length();i++){
//            if(str.charAt(i) == '7'){
//                c++;
//            }
//        }
//        System.out.println("Occurance = "+c);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter series of number that contains repetative numbers");
        int n = sc.nextInt();
        int c = 0,rem = 0;
        while (n > 0) {
            rem = n % 10;
            n = n/10;
            if (rem == 7) {
             c++;
            }
        }
        System.out.println(c);
    }
}
