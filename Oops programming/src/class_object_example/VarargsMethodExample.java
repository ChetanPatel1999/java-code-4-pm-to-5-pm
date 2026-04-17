package class_object_example;

public class VarargsMethodExample {

//    static void add(int... a) //varargs method
//    {
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) //3
//        {
//            sum = sum + a[i];//12
//        }
//        System.out.println("sum = " + sum);
//    }
    static void add(int... a) //{12,5,67,89}
    {
        int sum = 0;
        for (int num : a) //3
        {
            sum = sum + num;//17
        }
        System.out.println("sum = " + sum);
    }

    static void add(double... a) //{12,5,67,89}
    {
        double sum = 0;
        for (double num : a) //3
        {
            sum = sum + num;//17
        }
        System.out.println("sum = " + sum);
    }

    static void display(int m,int b,String... a) //{"indore"}
    {
        System.out.println("city name : ");
        System.out.println(m);
        System.out.println(b);
        for (String data : a) //3
        {
            System.out.println(data);
        }
        System.out.println("------------");

    }

    public static void main(String[] args) {

        display(34,12,"indore", "ujjain", "mhow");
        display(78,56,"indore", "ujjain", "mhow", "indore");
        add(12, 5);

        add(4, 2, 9);
        add(4.4, 2.1, 9.3);
        add(4.4, 2.1);

        add(4, 23, 78, 90);

        add(10, 20, 40, 70, 90, 25);

    }
}
