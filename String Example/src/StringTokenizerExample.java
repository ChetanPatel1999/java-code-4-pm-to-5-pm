
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String s = "php,c++,python,java,HTML,CSS,javascript";
//        StringTokenizer t1 = new StringTokenizer(s);
        StringTokenizer t1 = new StringTokenizer(s,",");
//        System.out.println(t1.hasMoreTokens());
//        System.out.println(t1.nextToken());
//        System.out.println(t1.nextToken());
//        System.out.println(t1.nextToken());
//        System.out.println(t1.nextToken());
//         System.out.println(t1.hasMoreTokens());
        System.out.println(t1.countTokens());
        while (t1.hasMoreTokens()) {
            System.out.println(t1.nextToken());
        }
        System.out.println(t1.countTokens());

    }
}

