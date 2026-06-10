//package dsaquestions.BinarySearch;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class First_Last_Element {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter element into the array");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter your target element");
//        int t = sc.nextInt();
//        System.out.println(Arrays.toString(fle(arr,t)));
//    }
//
// static int[] fle(int[] arr, int t) {
//        int l = 0,i,j;
//        int h = arr.length- 1;
//        while(i<= h){
//            int mid = l+(h-l)/2;
//            if(arr[mid] == t){
//                h = mid -1;
//
//            }
//        }
//        return [-1,-1];
//    }
//}