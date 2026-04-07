package class_object_example;
public class MouseUser {

    public static void main(String[] args) {
      
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        Mouse m3 = new Mouse();

      
        m1.setMouse("89", 200, 3.4);
        m2.setMouse("534", 500, 4.4);
        m3.setMouse("blue", 100, 2.4);

        m1.getMouse();
        m2.getMouse();
        m3.getMouse();
        
        m1.setMouse("red",1000, 4.9);
        m1.getMouse();

    }
}
