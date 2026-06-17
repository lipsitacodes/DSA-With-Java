package dsaquestions.BinarySearch;


import java.util.Arrays;
//this function just returns the index value of target

public class First_Last_Element {
    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 7, 7, 8, 8, 10};
        int t = 7;
        System.out.println(Arrays.toString(fle(arr, t)));
    }

    static int[] fle(int[] nums, int target) {
        int[] ans = {-1, -1};
        //Check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
//        ans[0] = start;
//        ans[1] = end;
         return ans;
    }
    static int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (findstartindex) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}
