package dsaquestions.BinarySearch;

import java.util.Arrays;

public class first_last_infinite_array {
    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 7, 7, 8, 8, 10, 11, 22, 45, 55, 55, 55, 65, 66, 67, 71, 75, 75, 75, 84};
        int t = 75;
        System.out.println(Arrays.toString(ans(arr, t)));
    }

    static int[] ans(int[] arr, int t) {
//first find the range
// we are starting with the box of size 2
        int l = 0;
        int h = 1;

        //condition for the target to lie in the range
        while (h < arr.length && t > arr[h]) {
            int newStart = h + 1;

            h = h + 2 * (h - l + 1);

            if (h >= arr.length) {
                h = arr.length - 1;
            }

            l = newStart;
        }
        return fle(arr, l, h, t);
    }


    static int binarysearch(int[] arr, boolean findstartindex, int l, int h, int target) {
        int ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findstartindex) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
//        while (l <= h) {
//            while (l <= h) {
//                int mid = l + (h - l) / 2;
//                if (arr[mid] == target) {
//                    return mid;
//                } else if (arr[mid] <= target) {
//                    l = mid + 1;
//                } else {
//                    h = mid - 1;
//                }
//            }
//        }
//        return -1;
    }

    static int[] fle(int[] nums, int l, int h, int target) {
        int[] ans = {-1, -1};
        //Check for first occurrence if target first
        ans[0] = binarysearch(nums, true, l, h, target);
        if (ans[0] != -1) {
            ans[1] = binarysearch(nums, false, l, h, target);
        }
        return ans;
    }
}