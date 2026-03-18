/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class IfElaseExamleThree {
//   Write a program to check given char is vowel or consonant.

    public static void main(String[] args) {
        char alpha = 'A';
        
        if (alpha >= 'A' && alpha <= 'Z') {
            alpha = (char) ((int) alpha + 32);
        }

        if (alpha == 97 || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println("vovel");
        } else {
            System.out.println("consonent");
        }

//        char ch[] = {'a', 'e', 'i', 'o', 'u'};
//        boolean f = false;
//        for (char val : ch) {
//            if (val == alpha) {
//                f = true;
//                break;
//            }
//        }
//        if (f) {
//            System.out.println("vovel");
//        } else {
//            System.out.println("consonet");
//        }
    }

}
