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
public class IfElseExampleFive {
//  Write a program to accept username and password and verify login (hardcoded 
//values).   

    public static void main(String[] args) {
        String userName, dataBaseUN = "swaroop";
        int password, dataBasePass = 5678;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter userName :");
        userName=sc.next();
        System.out.print("enter password :");
        password=sc.nextInt();
        
        if(userName.equals(dataBaseUN) && password==dataBasePass)
        {
            System.out.println("Log in succefully");
        }
        else
        {
            System.out.println("wrong username or password");
        }
    }

}
