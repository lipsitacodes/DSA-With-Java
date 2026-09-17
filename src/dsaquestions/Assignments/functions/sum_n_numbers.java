package dsaquestions.Assignments.functions;

import java.util.Scanner;

public class sum_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N(Upto how many number you want to make sum)");
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
    static int sum(int n){
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
