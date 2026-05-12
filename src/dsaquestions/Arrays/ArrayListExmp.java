package dsaquestions.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExmp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
//        list.add(13);
//        list.add(12);
//        list.add(1);
//        list.add(10);
//        list.add(1024);
//        list.add(1032);
//        list.add(1022);
//        list.add(1033);
//        System.out.println(list);
//        list.addLast(87);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list.set(2, 34));
//        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
