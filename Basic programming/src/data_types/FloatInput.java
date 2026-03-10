package data_types;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class FloatInput {
    //wap to find are of circle.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, area;
        System.out.print("enter radius : ");
        radius = sc.nextDouble();
        area = 3.141 * radius * radius;
        System.out.printf("area of circle = %.2f\n", area);
    }

}
