/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object_example;

/**
 *
 * @author PC
 */
public class Circle {

    double radius, area, circumference;

    public void setRadius(double r) {
        radius = r;
    }

    public void computeOperation() {
        area = 3.141 * radius * radius;
        circumference = 2 * 3.141 * radius;
    }
    
    public void getCircle()
    {
        System.out.println("Circle info : ");
        System.out.println("radius : "+radius);
        System.out.println("area : "+area);
        System.out.println("circumference : "+circumference);
        System.out.println("-----------------------------------");
    }

}
