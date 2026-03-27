package ControlFlowExample;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++)//5
//        {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);//1 2 3 4
//
//        }

//        for (int i = 1; i <= 10; i++)//5
//        {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }
//        int i = 1;
//        while (i <= 10) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
        //make a game which based on guess number .
        Scanner sc = new Scanner(System.in);
        int num, guess;

        for (int i = 1; i <= 10; i++) //2
        {
            num = ((int) (Math.random() * 5)) + 1;
            System.out.print("guess any number between 1 to 10 : ");
            guess = sc.nextInt();
            if (num == guess) {
                System.out.println("wow! you guess right number");
                System.out.println("you are winnig game !");
                break;
            } else {
                System.out.println("correct number is : " + num);
                System.out.println("you guess wrong number !");
                System.out.println("you have only " + (10 - i) + " chancess only");
            }

        }

    }
}
