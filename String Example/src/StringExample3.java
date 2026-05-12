//string methods

public class StringExample3 {

    public static void main(String[] args) {

        String s1 = new String("indore"); //97
        String s2 = new String("indore"); //98
        int res = s1.compareTo(s2);
        System.out.println(res);

//        String s = new String("abc@gmail.co");
//        boolean res = s.startsWith("mr.");
//        boolean res = s.endsWith(".com");
//        System.out.println(res);
//        boolean res = s.equals("Ram");
//        boolean res = s.equalsIgnoreCase("Raj");
//        System.out.println(res);
//        int len = s.length();
//        System.out.println(len);
    }
}
//compare method of string class
// s.length()  //its return string length
// s.equals(String) //(case sensitive) its return true if strings are same 
// s.equalsIgnoreCase(String); //(caseinsensitive)
// s.startsWith()    // its check start string a particuler substring or not 
// s.endsWith()    // its check ends with string a particuler substring or not 
// s.compareTo(String) // its compare two string character ascii code
// return ascii value difference
//  s>String -->  +ve
//  s<String -->  -ve
//  s==String -->  0
