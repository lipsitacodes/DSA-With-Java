package dsaquestions.Linera_Search;

public class maxin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {35, 8, 21, 5, 92},
                {11, 33, 22, 4},
                {38, 98, 77, 24},
                {133, 2},
                {39, 78, 9, 23, 13}
        };
        System.out.println("The maximum number in 2D Array is : " + Max(arr));
    }

    static int Max(int[][] arr) {
        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (min >= anInt) {
                    min = anInt;
                }
            }
        }
            return min;

    }
}
