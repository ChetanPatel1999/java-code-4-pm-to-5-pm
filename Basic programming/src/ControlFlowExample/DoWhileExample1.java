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
public class DoWhileExample1 {

    public static void main(String[] args) {
//        do {
//            System.out.println("hello students");
//        } while (12 > 7);

//        int i = 1;
//        do {
//            System.out.println("hello students");
//            i++;//3
//        } while (i <= 5);
        int total = 0, marks, num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter marks : ");
            marks = sc.nextInt();//50
            total = total + marks;//60
            System.out.print("you want to add more marks press 1 : ");
            num = sc.nextInt();//8
        } while (num == 1);

        System.out.println("Total marks = " + total);
    }
}
