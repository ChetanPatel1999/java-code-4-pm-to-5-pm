
import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        String s1 = "indore", s2 = "ujjain", s3 = "ratlam", s4 = "mhow";
//        StringJoiner join = new StringJoiner("---");
        StringJoiner join = new StringJoiner(",","<---","--->");
        join.add(s1);
        join.add(s2);
        join.add(s3);
        join.add(s4);
        System.out.println(join);
    }

}
