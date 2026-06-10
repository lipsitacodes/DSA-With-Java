package dsaquestions.BinarySearch;

import java.util.Scanner;

public class CeilingOfCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sorted characters: ");
        String str = sc.nextLine();

        char[] name = str.toCharArray();

        System.out.print("Enter target character: ");
        char target = sc.next().charAt(0);

        System.out.println("Ceiling Character: " + celStr(name, target));
    }

    static char celStr(char[] name, char target) {
        int l = 0;
        int h = name.length - 1;

        while (l <= h) {
            int mid = l + ( h - l) / 2;

            if (target < name[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return name[l % name.length];
    }
}