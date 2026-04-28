package inheritaceexample;

class Base5 {

    Base5() {
        System.out.println("base 0 arg constructor is called");
    }

    Base5(int a) {
        System.out.println("base 1 arg constructor is called");
    }

    Base5(int a, int b) {
        System.out.println("base 2 arg constructor is called");
    }
}

class Derived5 extends Base5 {

    Derived5()
    {
        super(3);
        System.out.println("Derived 0 arg constructor is called");
    }

    Derived5(int a) {
        super(45, 78);
        System.out.println("Derived 1 arg constructor is called");
    }

    Derived5(int a, int b) {
        System.out.println("Derived 2 arg constructor is called");
    }
}

public class ConstructorInheritance {

    public static void main(String[] args) {
        Derived5 obj = new Derived5();
    }
}
    