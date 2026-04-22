package inheritaceexample;

class A {

    void m1() {
        System.out.println("class A m1 ");
    }

    void m2() {
        System.out.println("class A m2 ");
    }
}

class B extends A{

    void m3() {
        System.out.println("class B m3 ");
    }

    void m4() {
        System.out.println("class B m4 ");
    }
}

public class InheritaceExample {

    public static void main(String[] args) {
//         A o1= new A();
//         o1.m1();
//         o1.m2();

        B o1 = new B();
        o1.m1();
        o1.m2();
        o1.m3();
        o1.m4();
    }

}
