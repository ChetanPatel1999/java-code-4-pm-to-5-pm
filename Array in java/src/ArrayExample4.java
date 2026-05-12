
import java.util.Scanner;

public class ArrayExample4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // its make array of 5 size with 0 value initielized

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr index " + i + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("array element are : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
