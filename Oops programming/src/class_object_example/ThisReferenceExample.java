package class_object_example;

class Test1 {

    int x, y;

    public Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getData() {
        int x = 900;
        System.out.println("object data : ");
        System.out.println("local variable x = " + x);
        System.out.println("intance x = " + this.x);
        System.out.println("intance y = " + y);
        System.out.println("---------------");
    }
}

public class ThisReferenceExample {

    public static void main(String[] args) {
        Test1 t1 = new Test1(12, 5);
        Test1 t2 = new Test1(30, 40);

        t1.getData();
        t2.getData();
    }
}
