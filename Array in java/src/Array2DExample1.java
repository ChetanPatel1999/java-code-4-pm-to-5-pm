
import java.util.Scanner;

public class Array2DExample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] mat = {
//            {12, 34, 56},
//            {44, 66, 77},
//            {33, 43, 56}
//        };
        int r, c;
        System.out.print("enter row : ");
        r = sc.nextInt();
        System.out.print("enter col : ");
        c = sc.nextInt();
        int mat[][] = new int[r][c];
        System.out.println("enter matrix element : ");
        for (int i = 0; i < r; i++) //1
        {
            for (int j = 0; j < c; j++)//3
            {
                System.out.printf("enter pos[%d][%d] : ", i + 1, j + 1);
                mat[i][j] = sc.nextInt();
            }

        }

        System.out.println("matrix element : ");
        for (int i = 0; i < r; i++) //1
        {
            for (int j = 0; j < c; j++)//3
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

        //sum of all matrix element 
        int sum = 0;
        for (int i = 0; i < r; i++) //1
        {
            for (int j = 0; j < c; j++)//3
            {
                sum += mat[i][j];
            }
        }
        System.out.println("sum of all matrix element : " + sum);
        System.out.println("average of all matrix element : " + sum / (float) (r * c));
    }
}
