/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class WhileExample1 {

    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("hello students");
//            i++;
//        }

//        int i = 1;
//        while (i <= 10) {
//            System.out.print(i+" ");
//            i++;
//        }
//        int i = 1;
//        while (i <= 10) {
//            System.out.print(i + " ");
//            i += 2;
//        }
        int i = 1, res = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                res = res + i;
            }
            i++;//6
        }
        System.out.println(res);
    }
}
