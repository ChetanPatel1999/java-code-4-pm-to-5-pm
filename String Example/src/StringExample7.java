
public class StringExample7 {

    public static void main(String[] args) {

        String s = new String("hello i am chetan patel");

        String arr[] = s.split(" "); // {"indore" , "ratlam" }

        for (String data : arr) {
            System.out.println(data+ " = "+data.length());
        }

//        System.out.println(s);
//        boolean res = s.isEmpty();
//        System.out.println(res);
//        s = (s+" ").repeat(4);
//        s = s.replace('e', 'p');
//        s = s.replace("indore","ujjain");
//        System.out.println(s);
//        char ch[] = s.toCharArray();
//        byte b[] = s.getBytes();
//
//        for (byte val : b) {
//            System.out.println(val);
//        }
        //wap to check given substring is present in string or not.
//        String s = "indore is a clean city";
//        String sb = "cleann";
//        if(s.contains(sb))
//        {
//            System.out.println(sb + " present in "+"'"+s+"'"); 
//        }
//        else
//        {
//              System.out.println(sb + " not present in "+"'"+s+"'"); 
//        }
//        boolean res = s.contains("iindore");
//        System.out.println(res);
//        s = s.concat(" city");
//        s = s.concat(" "+l);
//        System.out.println(s);
//        s = s.toLowerCase();
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);
//        char ch = s.charAt(4);
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
    }
}
//s.charAt(index) // its return charcter from string at given index
//s.toUpperCase() // return new UperCase string
// s.concat(" city") // combine two string and return new string
// s.toCharArray(); its return character from string
//s.contains(sb) ; its check sub str present in string or not
//s.getBytes(); its return a byte array
//s.replace('oldchar', 'new char'); its replache old char with new char
//s.repeat(times) ; its repeat string
// s.isEmpty(); // check string is empty or not
//s.split() ; //return string array
