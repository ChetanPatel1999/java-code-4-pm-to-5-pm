package class_object_example;

class Number {

    private int num1;
    private int num2;

    public void setNumber(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void getNumber() {
        System.out.println("Numbers....");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("------------------");
    }

    void sumSameObjectDataMember() {
        System.out.println("sum = " + (num1 + num2));
        System.out.println("----------------------");
    }

    void sumDiffObjectDataMember(Number obj) {
        System.out.println("sum = " + (num1 + obj.num2));
        System.out.println("sum = " + (num2 + obj.num1));
        System.out.println("----------------------");
    }
    
    static void sumDiffObjectDataMember(Number obj1,Number obj2) {
        System.out.println("sum = " + (obj1.num1 + obj2.num1));
        System.out.println("sum = " + (obj1.num2 + obj2.num2));
        System.out.println("----------------------");
    }
}

public class objectPassAsArgumentExample {

    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.setNumber(12, 5);
        n2.setNumber(10, 8);
        n1.getNumber();
        n2.getNumber();

        n1.sumSameObjectDataMember();
        n2.sumSameObjectDataMember();

        n1.sumDiffObjectDataMember(n2);
        
        Number.sumDiffObjectDataMember(n1, n2);

    }

}
