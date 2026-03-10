package data_types;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is addition app : ");

        int a, b, c;
        System.out.print("enter first num : ");
        a = sc.nextInt();
        System.out.print("enter second num : ");
        b = sc.nextInt();
        c = a + b;
        System.out.printf("addition of %d and %d = %d\n",a,b,c);
//        System.out.println("addition of "+a+" and "+b+" = "+c);
//        System.out.println("addition = " + c);

    }

}
