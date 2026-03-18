/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class ElseIf5 {
//Write a  program to check whether a character is uppercase alphabet or lowercase 
//alphabet or not alphabet. 

    public static void main(String[] args) {
//        char ch = 'T';
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("char is lower case");
//        } else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("char is upper case");
//        } else {
//            System.out.println("char is not alphabet");
//        }

        char ch = '4';
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
            System.out.println("char is alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("char is digit");
        } else {
            System.out.println("char is special symbol");
        }

    }

}
