package dsaquestions.Sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] a = {5,3,4,1,2};
        Sort(a);
    }
    static void Sort(int[] a){
        for(int i = 0;i<=a.length-2;i++){
            for(int j = i+1;j>0;j--){
                if(a[j-1] > a[j]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Array after applying insertion sort : "+ Arrays.toString(a));
    }
}
