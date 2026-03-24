/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SwitchExample3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<------welcome to my calculator------>");
        System.out.println("    press 1 for addition ");
        System.out.println("    press 2 for subtraction ");
        System.out.println("    press 3 for multiplication ");
        System.out.println("    press 4 for division ");
        System.out.print("    press any number : ");
        int num;
        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("you choosed addition app ");
                int a,
                 b,
                 c;
                System.out.print("enter first num : ");
                a = sc.nextInt();
                System.out.print("enter second num : ");
                b = sc.nextInt();
                c = a + b;
                System.out.println("addition : " + c);
                break;
            case 2:
                System.out.println("you choosed subtraction app ");
                System.out.print("enter first num : ");
                a = sc.nextInt();
                System.out.print("enter second num : ");
                b = sc.nextInt();
                c = a - b;
                System.out.println("subtraction : " + c);
                break;
        }
    }
}
