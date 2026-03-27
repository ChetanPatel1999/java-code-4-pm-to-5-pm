package ControlFlowExample;

public class NestedLoop {

    public static void main(String[] args) {

        //inner for loop decide no. of colum in pattern
        //oter for loop decide no. of row in pattern
//        for (int i = 1; i <= 3; i++) //2
//        {
//
//            for (int j = 1; j <= 5; j++) //
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//
//        }
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println("");
//
//        }
//
//        for (int i = 1; i <= 5; i++) //2
//        {
//
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println("");
//
//        }
//        for (int i = 1; i <= 5; i++) //2
//        {
//
//            for (int j = 1; j <= i; j++) {
//                
//                System.out.print("*" + " ");
//            }
//            System.out.println("");
//
//        }
//        for (int i = 1; i <= 5; i++) //2       
//        {
//
//            for (int j = i; j <= 5; j++) {
//
//                System.out.print("*" + " ");
//            }
//            System.out.println("");
//
//        }
        for (int i = 1; i <= 5; i++) //2       
        {

            for (int j = i; j <= 5; j++)//2 
            {

                System.out.print(j + " ");
            }
            System.out.println("");

        }
    }
}
