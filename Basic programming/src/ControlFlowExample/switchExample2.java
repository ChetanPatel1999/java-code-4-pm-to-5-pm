/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowExample;

/**
 *
 * @author PC
 */
public class switchExample2 {
   //print full state name according to short state name.
    public static void main(String[] args) {
        
       String state="up";
       switch(state)
       {
           case "mp":System.out.println("madhya-pradesh");break;
           case "up":System.out.println("uttar-pradesh");break;
           case "rj":System.out.println("rajsthan");break;
           case "mh":System.out.println("maharastra");break;
           case "hr":System.out.println("haryana");break;
           default:System.out.println("wrong state name !");
       }
    }
}
