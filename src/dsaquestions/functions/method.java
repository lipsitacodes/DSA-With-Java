package dsaquestions.functions;

import java.util.Scanner;

class Sum{

 public int sum(int a, int b) {
    return a + b;
}
}

 class method {
    //Q: Take input of two number print their sum
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        Sum obj = new Sum();
        for (int i = 0;i<10;i++){

        System.out.println("Enter value of 1st num");
        a = sc.nextInt();
        System.out.println("Enter value of 2nd num");
        b = sc.nextInt();
        int res = obj.sum(a,b);
        System.out.println("Sum is : " +res);
        }

    }
}
