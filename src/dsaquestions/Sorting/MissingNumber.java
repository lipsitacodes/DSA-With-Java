package dsaquestions.Sorting;
//https://leetcode.com/problems/missing-number/description/
class Solution {
    public static void main(String[] args) {
        int n = 3;
        int[] a = {3, 0, 1};
        int res = missingNumber(a, n);
        System.out.print(res);
    }

    static int missingNumber(int[] a, int n) {
        int i = 0;
        while (i < n) {
            int correctIndex = a[i];
            if (a[i] < n && a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (j != a[j]) {
                return j;
            }
        }

        return n;
    }
}