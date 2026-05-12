
import java.util.Scanner;

public class StringExample4 {

    public static void main(String[] args) {
        String gmail;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your gmail id : ");
        gmail = sc.next();

        if (gmail.endsWith("gmail.com")) {
            System.out.println("valid gmail !");
        } else {
            System.out.println("invalid gmail !");
        }
    }

}
