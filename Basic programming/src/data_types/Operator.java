package data_types;

public class Operator {

    static void CmpAssign() {
        int a = 12, b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//        a += b;
//        a += 10;
//        b -= a;
//        b *= a;
//        b =+ 1;
//        b = - 1;
//        b += 1;
        System.out.println("----------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static void pre_post() {
        int a = 12, b;
//        b = a++;
        b = ++a;
        System.out.println("a = " + a);//13
        System.out.println("b = " + b);//12
    }

    public static void main(String[] args) {
//        pre_post();
        boolean res = !(12 > 7 || 4==5);
        System.out.println(res);
//        CmpAssign();

//        int a;
//        int b;
//        int res;
//        a = 77;
//        b = 100;
//        res = a % b;
//
//        boolean ans = 9 != 9;
//        System.out.println("res = " + ans);
//        System.out.println("res = "+res);
    }

}
