/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object_example;

import java.util.Scanner;

public class Empoly {

    private int id;
    private double sallary;
    Scanner sc = new Scanner(System.in);

    //methods
    public void setEmploy() {
        System.out.println("enter emp info : ");
        System.out.print("enter id : ");
        id = sc.nextInt();
        System.out.print("enter sallary : ");
        sallary = sc.nextDouble();
    }

    public void getEmploy() {
        System.out.println("emp info : ");
        System.out.println("emp id : " + id);
        System.out.println("emp sallary : " + sallary);
        System.out.println("------------------------------");
    }
}
