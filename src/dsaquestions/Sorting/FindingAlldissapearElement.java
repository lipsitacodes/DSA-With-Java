package dsaquestions.Sorting;

import java.util.ArrayList;
import java.util.List;

class FindingAlldissapearElement {

    public static void main(String[] args) {

        int n = 5;

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(4);

        List<Integer> res = findDisappearedNumbers(a, n);

        System.out.println(res);
    }

    static List<Integer> findDisappearedNumbers(List<Integer> a, int n) {

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (!a.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }
}