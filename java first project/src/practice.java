
public class practice {

    void show() {
        System.out.println("hi am show method");
    }

    void display() {
        System.out.println("hi i am display method");
    }

    public static void main(String[] args) {
        System.out.println("hello i am main method");
        practice obj = new practice();
        obj.show();
        System.out.println("inside main method");
        obj.display();

    }

}
