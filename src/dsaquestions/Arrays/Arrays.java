package dsaquestions.Arrays;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Arrays {
    public static void main(String[] args) {

        //creating array to store values
        int[] var = new int[5];
        //directly declaring the value as well as declaring the array
        int[] arr2 = {1, 2, 3, 5, 6, 7};

        int[] a;//declaration of array,a is gettin defined in the stack
        a = new int[5];//initialization: actually here object is being created in the heap ,new keyword is used to create an object in heap memory

        System.out.println(arr2[2]);
        String[] arr = new String[4];
        System.out.println(arr[0]);
        String str = null;
        //int a = null; it will give you and error


    }
}
