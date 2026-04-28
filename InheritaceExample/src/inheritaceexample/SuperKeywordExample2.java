package inheritaceexample;

class base1 {

    base1(int a) {
        System.out.println("base class 1 arg constructor is called ");
    }

    base1(int a, int b) {
        System.out.println("base class 2 arg constructor is called ");
    }
}

class child1 extends base1 {

    child1(int a) {
        super(12,34);
        System.out.println("child class 1 arg constructor is called ");
    }

    child1(int a, int b) {
        super(45, 67);
        System.out.println("child class 2 arg constructor is called ");
    }
}

public class SuperKeywordExample2 {

    public static void main(String[] args) {
        child1 c1 = new child1(45);
    }
}
