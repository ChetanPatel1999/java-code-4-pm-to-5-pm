package class_object_example;

class display {

    void add(int a, int b) {
        System.out.println("sum = " + (a + b));
    }

    void add(double a, int b) {
      
        System.out.println("sum = " + (a + b));
    }

    void add(int a, double b) {
          System.out.println("hello");
        System.out.println("sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("sum = " + (a + b + c));
    }

    void add(int a, int b, int c, int d) {
        System.out.println("sum = " + (a + b + c + d));
    }

    void disp(int data) {
        System.out.println("data : " + data);
    }

    void disp(double data) {
        System.out.println("data : " + data);
    }

    void disp(String data) {
        System.out.println("data : " + data);
    }
}

public class MethodOverlodingExample {

    public static void main(String[] args) {
        display d1 = new display();
//        d1.disp(89);
//        d1.disp(89.56);
//        d1.disp("hello brother");
//        d1.add(5.6, 9);
        d1.add(5, 9.4);
//        d1.add(45, 10, 5, 20);
//        d1.add(12, 6);
//        d1.add(3, 4, 6);
    }

}
