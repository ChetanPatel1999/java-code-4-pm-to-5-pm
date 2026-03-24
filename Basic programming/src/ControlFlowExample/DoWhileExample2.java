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
public class DoWhileExample2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, order, num, totalBill = 0, a = 0, b = 0, c = 0, q;
        System.out.print("enter your age : ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("welcome to my club !");
            do {
                System.out.println("club menu : ");
                System.out.println("1. burger : 100");
                System.out.println("2. pizza : 120");
                System.out.println("3. cold coffe : 80");
                System.out.print("choose any item : ");
                order = sc.nextInt();
                if (order == 1) {
                    System.out.print("Enter quantity : ");
                    q = sc.nextInt();
                    System.out.println("your" + q + " burger is orderd ");
                    totalBill = totalBill + 100 * q;
                    a = a + q;
                } else if (order == 2) {
                    System.out.print("Enter quantity : ");
                    q = sc.nextInt();
                    System.out.println("your" + q + " pizaa is orderd ");
                    totalBill = totalBill + 120 * q;
                    b = b + q;
                } else if (order == 3) {
                    System.out.print("Enter quantity : ");
                    q = sc.nextInt();
                    System.out.println("your " + q + "cold coffe is orderd ");
                    totalBill = totalBill + 80 * q;
                    c = c + q;
                } else {
                    System.out.println("wrong choise ! ");
                }

                System.out.print("you want to order something more press 1 :");
                num = sc.nextInt();
            } while (num == 1);

            System.out.println("\n\n<--------------sir/mem your Bill------------------>");
            System.out.println("---------------------------------------------------");
            System.out.println("   Item          price       quantity       Bill ");
            System.out.println("   Burger        100           " + a + "             " + 100 * a);
            System.out.println("   Pizza         120           " + b + "             " + 120 * b);
            System.out.println("   Cold Coffe    80            " + c + "             " + 80 * c);
            System.out.println("---------------------------------------------------");
            System.out.println("             Total Bill = " + totalBill);
            System.out.println("---------------------------------------------------");

        } else {
            System.out.println("your entry is not allowed in club");
        }
    }
}
