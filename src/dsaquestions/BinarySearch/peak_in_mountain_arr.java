package dsaquestions.BinarySearch;
public class peak_in_mountain_arr {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 5, 7, 6, 5, 3, 2, 1, 0};
        System.out.println(search(arr));
    }

    static int search(int[] arr) {
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
this program leads to find peak in mountain array
it is basically find the maximum number in the array and return it tha't it all about
 */
