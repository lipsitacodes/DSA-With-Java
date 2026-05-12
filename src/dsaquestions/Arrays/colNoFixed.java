package dsaquestions.Arrays;

public class colNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 4, 5},
                {4, 6, 8},
                {22, 54}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
