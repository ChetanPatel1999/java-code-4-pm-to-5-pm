/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class WhileExample2 {

    public static void main(String[] args) {
//        . Write a program takes a number as input and prints each digit of the 
//number in reverse order, with each digit displayed on a separate line. 
//        int num = 321, rem;
//        while (num != 0) {
//            rem = num % 10;
//            System.out.println(rem);
//            num = num / 10;
//        }

//Write a program to takes a number as input and calculates the sum of its 
//individual digits. 
//        int num = 678, rem, res = 0;
//        while (num != 0) {
//            rem = num % 10;
//            res = res + rem;
//            num = num / 10;
//        }
//        System.out.println(res);
// Write a program to that takes a number as input and calculates the sum of 
//only its even digits. 
//        int num = 678, rem, res = 0;
//        while (num != 0) {
//            rem = num % 10;
//            if (rem % 2 == 0) {
//                res = res + rem;
//            }
//            num = num / 10;
//        }
//        System.out.println(res);
//. Write a program that takes a number as input and counts how many digits 
//it contains.
//        int num = 6548, res = 0;
//        while (num != 0) {
//            res++;//3
//            num = num / 10;//0
//        }
//        System.out.println(res);
//        int num = 3443, rem, rev = 0;
//        while (num != 0) {
//            rem = num % 10;
//            rev = rev * 10 + rem;//456
//            num = num / 10;
//        }
//        System.out.println(rev);
        int num = 344, rem, rev = 0, temp;
        temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;//456
            num = num / 10;
        }
        if (rev == temp) {
            System.out.println("plindrom num");
        } else {
            System.out.println("not plindrom num");
        }
    }

}
