
public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("indore");
        System.out.println(s);
//        s.append("city");
//        s.append('p');
//        s.append(12);
//        s.insert(3, "hello");
//        s.setCharAt(2, 'p');
//        s.replace(2, 4, "hello");
//        s.deleteCharAt(3);
//        s.delete(1, 4);
//          s.reverse();
        String s1 = s.toString();  // string buffer object convert in string object
        String s2 = s1.toUpperCase();
        System.out.println(s2);

        StringBuffer s5 = new StringBuffer("hello");
        StringBuilder s6 = new StringBuilder("ram");
   
    }

}
// s.append () // add data at end of string
//s.insert(index , string); 
