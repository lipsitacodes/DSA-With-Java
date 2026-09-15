package dsaquestions.BinarySearch;

public class RotatationOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int p = findPivot(arr);
        return p + 1;

    }

    static int findPivot(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            //Four cases over here
//            case : 1
            if (mid < h && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//            case : 2
            else if (mid > l && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//            case : 3
            else if (arr[mid] <= arr[l]) {
                h = mid - 1;
            }
//            case : 4
            else {
                l = mid + 1;
            }
        }
        return -1;
    }
}