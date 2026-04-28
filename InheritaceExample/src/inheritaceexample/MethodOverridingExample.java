package inheritaceexample;

final class base {

    final void display() {
        System.out.println("base display");
    }

    void display(int a) {
        System.out.println("hi base display");
    }
}

class derived extends base {

//    void display() //method ovverride
//    {
//        System.out.println("derived display");
//    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {
        derived d1 = new derived();
        d1.display();

        final int a = 12;
        System.out.println("a = " + a);
//       a = 89;  // show error
        System.out.println("a = " + a);

    }
}
