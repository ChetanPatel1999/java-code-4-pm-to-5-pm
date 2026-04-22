package class_object_example;
//
//class Dog {
//
//    String name;
//    int age;
//    String color;
//
//    void getDog() {
//        System.out.println("Dog Info : ");
//        System.out.println("Name : " + name);
//        System.out.println("Age : " + age);
//        System.out.println("Color : " + color);
//        System.out.println("---------------------");
//    }
//
//    void setDog(String n, int a, String c) 
//    {
//        setDog(n, a);
//        color = c;
//    }
//
//    void setDog(String n, int a) {
//        setDog(n);
//        age = a;
//    }
//
//    void setDog(String n) {
//        name = n;
//    }
//}

class Dog {

    String name;
    int age;
    String color;

    void getDog() {
        System.out.println("Dog Info : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Color : " + color);
        System.out.println("---------------------");
    }

    Dog() {
    }

    
    Dog(String n, int a, String c) {
        this("hello", 12);
        color = c;
//         f1();
    }

    Dog(String n, int a) {
        this(n);
        age = a;
    }

    Dog(String n) {
        name = n;
    }
}

public class ConstructorExamle2 {

    public static void main(String[] args) {
        Dog d1 = new Dog("moti", 9, "brown");
        d1.getDog();

    }
}
