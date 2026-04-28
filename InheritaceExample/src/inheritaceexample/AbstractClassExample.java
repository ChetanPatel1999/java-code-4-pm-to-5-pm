package inheritaceexample;

abstract class X // abstract class
{

    void m1() //concrete method
    {
        System.out.println("X m1 is called");
    }

    void m2() //concrete method
    {
        System.out.println("X m2 is called");
    }

    abstract void m3();  //abstrac method

    abstract void m4();  //abstrac method
}

class Y extends X {

    void m3() {
        System.out.println("Y m3 override method");
    }

    void m4() {
        System.out.println("Y m4 override method");
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {
        Y obj = new Y();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }

}
