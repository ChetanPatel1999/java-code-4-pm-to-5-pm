/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object_example;

import java.util.LinkedList;

class MyTest {

    int x;
    int y;

    public MyTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getData() {
        System.out.println("my Data : ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    public boolean equals(MyTest obj) {
        if (x == obj.x && y == obj.y) {
            return true;
        } else {
            return false;
        }
    }
}

public class EqualsOperatorAndEqualsMethod {

    public static void main(String[] args) {
        MyTest t1 = new MyTest(12, 5);
        MyTest t2 = new MyTest(7, 5);
        MyTest t3 = t1;

        System.out.println(t1.equals(t2));

//        System.out.println(t1 == t3);// true
//        System.out.println(t1 == t2); // false
//        String s1 = new String("indore");
//        String s2 = new String("indore city");
//
    

////        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//       LinkedList l1 = new LinkedList();
//        l1.add(120);
//        l1.add(20);
//
//        LinkedList l2 = new LinkedList();
//        l2.add(12);
//        l2.add(20);
//        System.out.println(l1);
//        System.out.println(l2);
////        System.out.println(l1==l2);
//        System.out.println(l1.equals(l2));
    }
}
