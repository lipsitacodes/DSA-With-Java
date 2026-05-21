package dsaquestions.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] a = {234, 54, 55, 9807};
        System.out.println(count(a));
        System.out.println(digit2(-7685));
    }

    public static int count(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //this function is used to check weather the and array contains of even number digit number or not
    public static boolean even(int num) {
        int numberOfDigits = digit2(num);
        return numberOfDigits % 2 == 0;
    }

    //this function over here is used to find the number digit in a given number
    public static int digit(int num) {
        //used convert negative numbers into positive numbers
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
    //another optimal way to calculate the number of digit present in a number 
    static int digit2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num))+1;
    }


}
