package ControlFlowExample;

public class lablingOfLoopsExample {

    public static void main(String[] args) {
//        lab1:
//        for (int i = 1; i <= 3; i++) //3
//        {
//            lab2:
//            for (int j = 1; j <= 5; j++) //1
//            {
//
//                for (int k = 1; k <= 5; k++) //1
//                {
//                    System.out.print(k + " ");
//                    if (k == 3) {
//                        break lab1;
//                    }
//                }
//                System.out.println("");
//            }
//
//            System.out.println("");
//        }

//        lab1:
//        for (int i = 1; i <= 3; i++) //2
//        {
//            lab2:
//            for (int j = 1; j <= 5; j++) //1
//            {
//
//                for (int k = 1; k <= 5; k++) //1
//                {
//                    if (k == 3) {
//                        continue lab1;
//                    }
//                    System.out.print(k + " ");
//
//                }
//                System.out.println("");
//            }
//
//            System.out.println("");
//        }
        String s = "ababaccdgdghcb";
        int c;
        int i;
        outer:
        for (i = 0; i < s.length(); i++) //1
        {
            c = 0;
            for (int j = i; j < s.length(); j++)//1 
            {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;//2
                }
                if (c == 3) {
                    System.out.println(s.charAt(i));
                    break outer;
                }
            }
//            if (c == 3) {
//                break;
//            }
        }

    }

}
