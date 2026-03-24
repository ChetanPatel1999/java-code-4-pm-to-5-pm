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
public class NestedIfElseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, order;
        System.out.print("enter your age : ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("welcome to my club !");
            System.out.println("club menu : ");
            System.out.println("1. burger : 100");
            System.out.println("2. pizza : 120");
            System.out.println("3. cold coffe : 80");
            System.out.print("choose any item : ");
            order = sc.nextInt();
            if (order == 1) {
                System.out.println("your burger is orderd please pay 100 rs");
            } else if (order == 2) {
                System.out.println("your pizaa is orderd please pay 120 rs");
            } else if (order == 3) {
                System.out.println("your cold coffe is orderd please pay 80 rs");
            } else {
                System.out.println("wrong choise ! ");
            }
        } else {
            System.out.println("your entry is not allowed in club");
        }
    }

}
