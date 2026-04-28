package inheritaceexample;

class parent {

    int data = 200;

    void display() {
        System.out.println("parent data : " + data);
    }
}

class child extends parent {

    int data = 800;

    void display() {
        int data = 90;
        System.out.println("parent data : " + super.data);
        System.out.println("child data : " + this.data);
        System.out.println("local data : " +data);
    }

    void show() {
        display();
        super.display();
    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}
