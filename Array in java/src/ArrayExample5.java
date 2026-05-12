
import java.util.Scanner;

public class ArrayExample5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter array size : ");
        n = sc.nextInt();
        double[] data = new double[n];
//        data[0]=4.5;
//        data[1]=12.9;
        System.out.println("enter array element : ");
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextDouble();
        }
        System.out.println("array element are : ");
        for (double d : data) {
            System.out.print(d + " ");
        }

    }

}
