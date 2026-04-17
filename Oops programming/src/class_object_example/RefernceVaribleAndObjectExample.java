package class_object_example;

class Test {

    int x, y;

    public Test(int a, int b) {
        x = a;
        y = b;
    }

    public void getData() {
        System.out.println("object data : ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("---------------");
    }
}

public class RefernceVaribleAndObjectExample {

    public static void main(String[] args) {
        Test t1;    //here  make t1 reference variable
        new Test(12, 6);   // here make a object which reference not store any refernce variable
        Test t2 = new Test(10, 20);  // here t2 is a reference variable and also create a object with value 10 , 20

        Test t3 = t2;

        t1 = t2;

        t2 = new Test(50, 60);
        
        t3= new Test(4,6);
        t1= new Test(23,67);

        t2.getData();

        t3.getData();

        t1.getData();
    }

}
