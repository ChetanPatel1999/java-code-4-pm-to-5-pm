
public class Test {

    private int x, y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void change() {
        x++;
        y++;
    }

    void changeValue(int a, int b) {
        x = a;
        y = b;
    }

    void getData() {
        System.out.println(x + "," + y);
    }
}
