
package data_types;

import java.util.Scanner;


public class TernaryExamplethree {

    public static void main(String[] args) {
        //wap to check voter is eligible for casting vote or not
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("enter your age  : ");
        age = sc.nextInt(); //-8
        System.out.println(age >= 18 ? "you can vote " : "you can't vote");
    }
}
