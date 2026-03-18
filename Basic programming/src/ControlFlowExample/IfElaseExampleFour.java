/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class IfElaseExampleFour {

    public static void main(String[] args) {
//         Write a program to check whether a character is an special symbol or not. 
        char ch = '{';
        if (!(ch >= 'a' && ch <= 122 || ch >= 65 && ch <= 90 || ch >= '0' && ch <= '9')) {
            System.out.println("char is special symbol");
        } else {
            System.out.println("char is not special symbol");
        }
    }
}
