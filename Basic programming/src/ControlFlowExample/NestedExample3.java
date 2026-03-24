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
public class NestedExample3 {
    //Write a program to read the age of a candidate and determine whether he 
//is eligible to cast his/her own vote in india or not.
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String country;
          System.out.print("Enter your Country : ");
          country=sc.nextLine();
          if(country.equals("india"))
          {
               System.out.print("Enter your age : ");
               int age=sc.nextInt();
               if(age>=18)
               {
                   System.out.println("you can vote in india");
               }
               else
               {
                   System.out.println("you are not eligible for voting");
               }
          }
          else
          {
              System.out.println("you are not indian");
          }
    }
}
