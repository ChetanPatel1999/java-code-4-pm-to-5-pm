
package class_object_example;
public class Circle {

    private double radius, area, circumference;

    public Circle(double r) {
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
