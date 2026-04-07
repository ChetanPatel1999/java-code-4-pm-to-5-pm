package class_object_example;

public class Demo {

    int a;  //non static
    int b;  //non static
    static int c; // static/class
    static int d;

    void setData(int w, int x, int y, int z) {
        a = w;
        b = x;
        c = y;
        d = z;
    }
    void display()
    {
        System.out.println("a,b : "+a+","+b); 
        System.out.println("c,d : "+c+","+d); 
    }
    
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        
        d1.setData(12,13,500,600);
        d2.setData(14,15,700,800);
        d3.setData(16,17,900,1000);
        
        d1.display();
        d2.display();
        d3.display();
    }
}
