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
public class NestedExample2 {
//     Car Rental System – Outer switch for vehicle type, nested switch for rental 
//plan (hourly/daily). (nested switch).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to car rental app :");
        System.out.println("car company name  : ");
        System.out.println("1: BMW ");
        System.out.println("2: Thar");
        System.out.println("3: Range-Rover");
        System.out.print("select car : ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("you selected BMW !");
                System.out.println("select plan type : ");
                System.out.println("1. 1000/ Day ");
                System.out.println("2. 200/ Hours ");
                System.out.println("Choose plan :  ");
                int plan = sc.nextInt();
                switch (plan) {
                    case 1:
                        System.out.println("okk.. sir you selected per day plan ! ");
                        System.out.print("enter number of day : ");
                        int day = sc.nextInt();
                        int bill = day * 1000;
                        System.out.println("sir pleas pay " + bill + " rs amount");
                        System.out.println("happy journy sir !");
                        break;
                    case 2:
                        System.out.println("okk.. sir you selected per Hours plan ! ");
                        System.out.print("enter number of Hours : ");
                        int hours = sc.nextInt();
                        int hBill = hours * 200;
                        System.out.println("sir pleas pay " + hBill + " rs amount");
                        System.out.println("happy journy sir !");
                        break;
                    default:
                        System.out.println("no one plan exist");
                }
                break;
            case 2:
                System.out.println("you selected Thar !");
                System.out.println("select plan type : ");
                System.out.println("1. 600/ Day ");
                System.out.println("2. 150/ Hours ");
                System.out.println("Choose plan :  ");
                plan = sc.nextInt();
                switch (plan) {
                    case 1:
                        System.out.println("okk.. sir you selected per day plan ! ");
                        System.out.print("enter number of day : ");
                        int day = sc.nextInt();
                        int bill = day * 600;
                        System.out.println("sir pleas pay " + bill + " rs amount");
                        System.out.println("happy journy sir !");
                        break;
                    case 2:
                        System.out.println("okk.. sir you selected per Hours plan ! ");
                        System.out.print("enter number of Hours : ");
                        int hours = sc.nextInt();
                        int hBill = hours * 150;
                        System.out.println("sir pleas pay " + hBill + " rs amount");
                        System.out.println("happy journy sir !");
                        break;
                    default:
                        System.out.println("no one plan exist");
                }
                break;
        }

    }
}
