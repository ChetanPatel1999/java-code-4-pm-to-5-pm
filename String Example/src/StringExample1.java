
public class StringExample1 {

    public static void main(String[] args) {
        String s1 = new String("indore");
        StringBuffer s2 = new StringBuffer("Ujjian");

        System.out.println(s1);
        System.out.println(s2);

        Test t1 = new Test(12, 45);
        t1.getData();
        t1.change();
        t1.getData();

        t1.changeValue(55, 56);

        t1.getData();

    }

}
