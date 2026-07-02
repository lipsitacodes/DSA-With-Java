package dsaquestions.BinarySearch;

public class Searching_in_mountain_arr {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 5, 7, 6, 5, 3, 2, 1, 0};
        System.out.println(search(arr, 3));
    }
    static int search(int[] arr, int t) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = BS(arr, t, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return OBS(arr, t, peak + 1, arr.length - 1);
        }
    }
    static int BS(int[] arr, int t, int l, int h) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
    static int OBS(int[] arr, int t, int l, int h) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            // You are in the decreasing part of the mountain
            if (arr[mid] > arr[mid + 1]) {
                h = mid;      // mid can be the answer
            }
            // You are in the increasing part of the mountain
            else {
                l = mid + 1;  // mid cannot be the answer
            }
        }
        return l;
    }
}
/*
mountain array or bitonic array
arr = [2,3,5,6,7,3,2,1]
here l = 0 and h = 7 , m = 3
arr of 3 = 6 which is the mid element now let's check is 6 is greater than equals to m+1 element which is 7 --> answer is no so l = m+1 = 3+1 = 4
now check if arr of 4 which is 7 greater than equals to m+1 element which is 3 --> answer is no means you are in decreasing part of array so mid can be the answer so h = mid which is 4
now check l = h which breaks the condition so we return index l where we found our peak element
this program leads to find peak in mountain array
it is basically find the maximum number in the array and return it tha't it all about
 */
