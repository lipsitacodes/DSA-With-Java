package dsaquestions;

public class shadowing {
    static int x = 133;//this will be shadowed at line 9

    public static void main(String[] args) {
        int x;
        x = 12;//the class variale at line 4 is shadowed by this
        System.out.println("x inside the main function " + x); //12
        fun();//133
    }

    static void fun() {
        System.out.println("x outside the main function " + x);
    }
}
