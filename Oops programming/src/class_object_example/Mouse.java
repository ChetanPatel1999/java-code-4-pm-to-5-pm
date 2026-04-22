package class_object_example;

public class Mouse {

    //data member
    private String color;
    private int price;
    private double rating;

    //methods
    private boolean checkColor(String c) //re#d
    {
        int i;
        for (i = 0; i < c.length(); i++) {
            if (!(c.charAt(i) >= 'a' && c.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public Mouse(String color, int price, double rating) //setter data 
    {
        if (checkColor(color)) {
            this.color = color;
        } else {
            color = "invalid data";
        }
        this.price = price;
        this.rating = rating;
    }

    public void getMouse() // getter method
    {
        System.out.println("mouse info : ");
        System.out.println("color : " + color);
        System.out.println("price : " + price);
        System.out.println("rating : " + rating);
        System.out.println("---------------------\n");
    }

}
