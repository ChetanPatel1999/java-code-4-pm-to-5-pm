
import java.util.Scanner;

public class StringExample5 {

    public static void main(String[] args) {
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your username : ");
        username = sc.next();
        System.out.print("enter your password : ");
        password = sc.next();

        if (username.equalsIgnoreCase("hwuser")) {
            if (password.equals("hwindore")) {
                System.out.println("log in succefully");
            } else {
                System.out.println("wrong password");
            }
        } else {
            System.out.println("invalid user");
        }

    }
}
