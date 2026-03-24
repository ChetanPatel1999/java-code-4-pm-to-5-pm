/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class SwitchExample1 {
    //wap to print day name according to number.

    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1:System.out.println("monday");break;
            case 2:System.out.println("tuesady");break;
            case 3:System.out.println("wednusday");break;
            case 4:System.out.println("thursday");break;
            case 5:System.out.println("friday");break;
            case 6:System.out.println("saturday");break;
            case 7:System.out.println("sunday");break; 
            default:System.out.println("please enter 1 to 7");
        }
        
    }

}
