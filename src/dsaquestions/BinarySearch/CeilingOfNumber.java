package dsaquestions.BinarySearch;

import java.util.Scanner;

//find the smallest number which is greater than equal to the target number smallest upper bound
public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter element into the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Your Target Number : ");
        int t = sc.nextInt();
        int c = BSC(a, t);
        System.out.println("Ceiling Number of" + t + " is : " + c);
    }

    static int BSC(int[] a, int t) {
        int l = 0, h = a.length - 1;
        int mid;
        if (t > a[h]) {
            return -1;
        }
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (a[mid] == t) {
                return a[mid];
            } else if (a[mid] <= t) {
                l = mid + 1;

            } else {
                h = mid - 1;
            }
        } int ans = a[l];
        return ans;
    }
}
