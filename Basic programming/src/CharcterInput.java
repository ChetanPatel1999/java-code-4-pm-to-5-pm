
import java.util.Scanner;


public class CharcterInput {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           char ch;
           System.out.print("enter a  character : ");
           ch=sc.next().charAt(0);
           System.out.println("charcter = "+ch);
    }
 
}
