package ControlFlowExample;

import java.util.LinkedList;

public class ForEachLoopExample {

    static void example1() {
        int arr[] = {12, 34, 56, 78, 90};
        for (int i = 0; i < 5; i++) //5
        {
            System.out.println(arr[i]);
        }
    }

    static void example2() {
        int arr[] = {12, 34, 56, 78, 90, 20, 30};
        for (int num : arr) {
            System.out.println("hello students");
        }
    }

    static void example3() {
        int arr[] = {12, 34, 56, 78, 90, 20, 30};

        for (int num : arr) {
            System.out.println(num);
        }
    }

    static void example4() {
        int arr[] = {12, 34, 56, 78, 90, 20, 30};
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;//320
        }
        System.out.println("sum = " + sum);
    }

    static void example5() {
        double arr[] = {12.3, 34.2, 56.78, 78.45};

        for (double num : arr) {
            System.out.println(num);
        }

    }

    static void example6() {
        String cities[] = {"ujjain", "ratlam", "mhow", "dewas"};

        for (String city : cities) {
            System.out.println(city);
        }

    }

    static void example7() {
        boolean data[] = {true, true, false, true};

        for (boolean val : data) {
            System.out.println(val);
        }

    }

    static void example8() {
        int arr[] = {12, 34, 56, 78, 90, 20, 30};

        for (int num : arr) {
            if (num % 4 == 0) {
                System.out.println(num);
            }
        }
    }

    static void example9() {
        int arr[] = {12, 34, 56, 78, 90, 20, 30};

        for (int num : arr) {
            if (num >= 50 && num <= 100) {
                System.out.println(num);
            }
        }
    }

    static void example10() {
        LinkedList l1 = new LinkedList();
        l1.add(12);
        l1.add(45);
        l1.add(78);
        l1.add(90);
        l1.add(23);
//        System.out.println(l1);
        for (Object num : l1) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        example10();

    }
}
