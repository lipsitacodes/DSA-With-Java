package dsaquestions;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre you favorite fruit");
        String str = sc.nextLine();

//        This is the syntax of Enhance switch case=
        switch (str) {
            case "Mango" -> System.out.println("It's king of fruits and it's colour is yellow yummy");
            case "Apple" -> System.out.println("It's red sweet furit and it's yummy");
            case "Kiwi" -> System.out.println("It's green in colour quite sour in taste");
            case "Banana" -> System.out.println("It's best for pre workout meal and it's yummy");
            default -> System.out.println("Please enter a valid fruit name");
        }
    }
}
