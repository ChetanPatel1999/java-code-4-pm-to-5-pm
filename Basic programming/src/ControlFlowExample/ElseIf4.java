/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class ElseIf4 {

    //Write a program to find greatest number among has given three numbers.
    public static void main(String[] args) {
        int a = 12000, b = 5600, c = 1000;
        if (a > b && a > c) {
            System.out.println("greates num : " + a);
        } else if (b > c) {
            System.out.println("greates num : " + b);
        } else {
            System.out.println("greates num : " + c);
        }
    }
}
