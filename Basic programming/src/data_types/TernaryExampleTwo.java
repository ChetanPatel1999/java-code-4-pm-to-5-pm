/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_types;

import java.util.Scanner;

public class TernaryExampleTwo {

    public static void main(String[] args) {
        //wap to check given number is positive or nagative
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("enter num : ");
        num = sc.nextInt(); //-8

        String res = num > 0 ? "num is positive " : "num is nagative";
        System.out.println(res);
    }
}
