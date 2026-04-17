package class_object_example;

class Test {

    public Test() {
        System.out.println("0 arg constructor");
    }

    protected Test(int a) {
        System.out.println("1 arg constructor");
    }

    Test(int a, int b) {
        System.out.println("2 arg constructor");
    }

    Test(int a, int b, int c) {
        System.out.println("3 arg constructor");
    }

    void display() {
        System.out.println("hi i am display");
    }
}

public class ConstructorExample {

    public static void main(String[] args) {
        Test t1 = new Test(12);
        Test t2 = new Test(12, 3);
        Test t3 = new Test(90);
        t1.display();
        t1.display();

    }

}
