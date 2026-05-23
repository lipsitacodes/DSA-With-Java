package dsaquestions.Assignments.flowcontrols;

import java.util.Scanner;

public class KeeptakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or x to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            sum += Integer.parseInt(input);
        }

        System.out.println("Sum = " + sum);
    }
}


//import java.util.Scanner;
//
//public class KeeptakingInput {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Value of X : ");
//        int x = sc.nextInt();
//        System.out.println(KeepInput(x));
//
//    }
//
//    static int KeepInput(int x) {
//        Scanner sc = new Scanner(System.in);
//        int i = 0;
//        int sum = 0;
//        int a;
//        while (x != 0) {
//            System.out.println("Enter a number");
//            a = sc.nextInt();
//            sum = sum + a;
//            if (a == x) {
//                break;
//            }
//        }
//        return sum;
//    }
//
//}
