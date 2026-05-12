
public class ArrayExample2 {

    //visit array element using arr.lenhth or for loop
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 7, 90};

        System.out.println("array element are : ");
        for (int i = 0; i < arr.length; i++) //5
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        System.out.println("array even  element are : ");
        for (int i = 0; i < arr.length; i++) //5
        {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");

        //sum of all array element
        //12, 3, 56, 7, 90
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; //168
        }
        System.out.println("sum of all array elements : " + sum);
        System.out.println("average of all array elements : " + sum / (float) arr.length);

        System.out.println("array element are : ");
        for (int i = 0; i < arr.length; i++) //5
        {
            System.out.print(arr[i] + " ");
        }

        //add 5 in all array element
        for (int i = 0; i < arr.length; i++) //5
        {
            arr[i] = arr[i] + 5;
        }

        System.out.println("\narray element are : ");
        for (int i = 0; i < arr.length; i++) //5
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
