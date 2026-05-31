package dsaquestions.BinarySearch;

import java.util.Scanner;

//find the largest number which is smaller than or equal to the target number largest lower bound
public class FloorOfANumber {
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
        System.out.println("Floor Number of " + t + " is : " + c);
    }
    static int BSC(int[] a, int t) {
        int l = 0, h = a.length - 1;
        int mid;
        if(t < a[l]){
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
        }
        return a[h];
    }
}
/*
[12,23,24,56,75,77,78,89]
 0  1  2  3  4  5  6  7
 now her our target is basically target = 45 l = 0 , h = 7 , m = 3
 45 <= 56[mid]
l = 0,h = mid - 1 = 3-1 = 2
[12,23,24] m = 1
 0  1  2
23 < = 43 l = m+1 = 2, h = 2
 [24] index = 2 , l = 2, h = 2 is our target element is smaller or greater than the mid value
 45 >= 24 l = mid+1 = 2+1 = 3 ...this is the condition where our while loop exits and return the h over
 */