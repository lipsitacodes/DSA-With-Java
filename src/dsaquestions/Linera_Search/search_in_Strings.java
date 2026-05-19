package dsaquestions.Linera_Search;

import java.util.Scanner;

public class search_in_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter a character you want to search in string");
        char t = sc.next().charAt(0);
        System.out.println("Character " + t + " found in String :  " + StrSearch1(str, t) + " (using normal for loop)");
        System.out.println("Character " + t + " found in String :  " + StrSearch2(str, t) + " (using for each loop)");
    }

    static boolean StrSearch1(String s, char t) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                return true;
            }
        }
        return false;
    }

    static boolean StrSearch2(String s, char t) {
        if (s.isEmpty()) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            if (ch == t) {
                return true;
            }
        }
        return false;
    }

}
