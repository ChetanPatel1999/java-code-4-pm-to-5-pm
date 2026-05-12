
public class StringConstructors {

    public static void main(String[] args) {
//        String s = new String();
//        String s = new String("indore");
        char ch[] = {'a', 'b', 'c', 'd', 'e'};
//        String s = new String(ch);
//        String s = new String(ch,1,3);
        byte b[] = {65, 66, 67, 68, 69};
//        String s = new String(b,1,2);
        StringBuffer s2 = new StringBuffer("hello");
        String s = new String(s2);
        System.out.println(s);
    }
}
// String()  // 0 arg constrcutor
// String("string" )// 
// String(char [] ) 
// String(char [], offset , length ) 
// String(byte [] ) 
// String(byte [],offset , length ) 
// String(StringBuffer) 
