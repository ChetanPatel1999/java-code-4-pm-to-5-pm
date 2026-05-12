

public class ArrayExample3 {

    // print array elements using foreach loop
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 7, 90};
        System.out.println("array elements are : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("array even elements are : ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("\narray element sum : " + sum);

        System.out.println("array elements are : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        //add 5 in each array element
        //its not update value in array
        for (int num : arr) {
            num = num + 5;
        }

        System.out.println("\narray elements are : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

}
