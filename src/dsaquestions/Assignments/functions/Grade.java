package dsaquestions.Assignments.functions;

import java.util.Scanner;

//[Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:]
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mark out of 100");
        float mark = sc.nextFloat();
        print_grade(mark);
    }

    static void print_grade(float a) {
        if (a >= 90 && a <= 100) {
            System.out.println("Grade : AA");
        } else if (a >= 80 && a <= 90) {
            System.out.println("Grade : AB");

        } else if (a >= 70 && a <= 80) {
            System.out.println("Grade : BB");

        } else if (a >= 60 && a <= 70) {
            System.out.println("Grade : BC");

        } else if (a >= 50 && a <= 60) {
            System.out.println("Grade : CD");

        } else if (a >= 40 && a <= 50) {
            System.out.println("Grade : DD");

        } else {
            System.out.println("FAIl");
        }
    }
}
