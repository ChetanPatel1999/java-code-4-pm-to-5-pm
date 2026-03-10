
public class Test {

//    void add() {
//        int a, b, c;
//        a = 12;
//        b = 5;
//        c = a + b;
//        System.out.println("sum = " + c);
//    }
//    void add(int a, int b) {
//        int c;
//        c = a + b;
//        System.out.println("sum = " + c);
//    }
    int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    static void display(String a[]) {
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        String s[] = {"ram","shyam"};
        display(s);

    }
}
