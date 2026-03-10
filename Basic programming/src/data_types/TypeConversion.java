package data_types;

public class TypeConversion {

    public static void main(String[] args) {
        int age = 12; // here data type and literals type is same
        double price = 4; // here perforn impilicite type conversion
        int a = (int) 67.89;  // here perform explicite type casting

//    int b = true;   its not convert
//    int b="678"; its not converted
        float f = (float) 45.7;

        double d2= 12.67f;
        int c= (int)34l;
        int ch2= 'a';
        System.out.println(ch2);
        char ch =65;   // automatic type convesrion
        System.out.println(ch);
        System.out.println(price);
    }

}
