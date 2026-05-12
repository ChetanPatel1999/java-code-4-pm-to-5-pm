
public class StringExample6 {

    public static void main(String[] args) {
        String s = new String("indore is clean is city");
//        int index = s.indexOf('p');
//        int index = s.indexOf('i', 8);
//        int index = s.indexOf("is clean");
        int index = s.indexOf("is", 8);
        System.out.println(index);
    }

}
// searching method
//s.indexOf(char)  // return index number of given character
//s.indexOf(char , index)  // return index number of given character
//s.indexOf(String)  // return index number of given character
//s.indexOf(String,index)  // return index number of given character

