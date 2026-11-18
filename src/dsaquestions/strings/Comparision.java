package dsaquestions.strings;

public class Comparision {
    public static void main(String[] args) {
        String a = "lipsita";
        String b = "lipsita";
//Here == checks that if the reference variables are pointing to the same object or not
        System.out.println("Comparing using == medthod but here the ref variable are pointing to the same object \n" + (a == b));
//How to create a different object of same value
        String a1 = new String("Lipsita");
        String a2 = new String("Lipsita");
//     This will create a value outside the pull but inside the heap
        System.out.println("Comparing using == medthod & here two different ref variable are created using new keyword for the same value \n" + (a1 == a2));
        System.out.println("Comparing using equals method \n" + a1.equals(a2));
        System.out.println(a1.charAt(3));
    }
}
