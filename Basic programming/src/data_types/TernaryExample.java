package data_types;

import java.util.Scanner;

public class TernaryExample {

    public static void main(String[] args) {
//        String res = 12 > 7 ? "hello" : "by";
//        System.out.println(res);
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("enter first num : ");
        a = sc.nextInt();
        System.out.print("enter second num : ");
        b = sc.nextInt();
        String res = a == b ? "num are same" : "num are different";
        System.out.println(res);

    }

}
