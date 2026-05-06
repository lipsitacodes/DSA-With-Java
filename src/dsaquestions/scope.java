package dsaquestions;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        {
            int t = 45;
            //value initialized in this block , will remain in this block
            a = 23;
            System.out.println("Inside the block value a:" + a);
            System.out.println("Inside the block value a:" + t);
        }
        System.out.println("Outside the block value a:" + a);
        //System.out.println(t); cannot be print because t is not             declared in side the blocl
        //System.out.println(num);
    }

    static void random() {
        int num = 12;
        //this is called function scope you can acess the variable only inside the functions only not out side of function
    }
}
