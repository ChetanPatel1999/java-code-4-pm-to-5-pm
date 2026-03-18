package ControlFlowExample;

public class ElseIf3 {

    public static void main(String[] args) {
        //Write a program to accept a number and check it is multiple of 3,5,8 or multiple of 
//3,5 or multiple of 5,8 or multiple of 3,8 or only multiple of 3 or only multiple of 5 or 
//only multiple of 8  or not multiple of 3,5,8.

        int num = 14;
        if (num % 3 == 0 && num % 5 == 0 && num % 8 == 0) {
            System.out.println("num is multiple of 3,5,8");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("num is multiple of 3 and 5");
        } else if (num % 3 == 0 && num % 8 == 0) {
            System.out.println("num is multiple of 3 and 8");
        } else if (num % 8 == 0 && num % 5 == 0) {
            System.out.println("num is multiple of 8 and 5");
        } else if (num % 3 == 0) {
            System.out.println("num is multiple of 3 ");
        } else if (num % 5 == 0) {
            System.out.println("num is multiple of 5 ");
        } else if (num % 8 == 0) {
            System.out.println("num is multiple of 8 ");
        } else {
            System.out.println("not multiple of 3,5,8");
        }
    }

}
