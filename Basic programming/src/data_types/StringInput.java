
package data_types;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          String name;
          System.out.print("enter your name : ");
          name= sc.next();
          System.out.println("my name is "+name);           
    }
}
