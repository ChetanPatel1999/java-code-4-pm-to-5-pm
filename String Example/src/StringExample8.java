
public class StringExample8 {

    public static void main(String[] args) {
        //Write a program  to separate individual characters from a string (like:- h e l l o  w o r l d  i n s t i t u t e). 
        //        String s = "hello indore city";
        //        for (int i = 0; i < s.length(); i++) {
        //            System.out.print(s.charAt(i) + " ");
        //        }
        //        System.out.println("");

        //Write a program to count the number of vowels and consonants in a string. 
        //        String s = "hello indore city452";
        //        int vc = 0, cc = 0;
        //        for (int i = 0; i < s.length(); i++) {
        //            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        //                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        //                    vc++;
        //                } else {
        //                    cc++;
        //                }
        //            }
        //        }
        //        System.out.println("total vovel : " + vc);
        //        System.out.println("total consonent : " + cc);
        //        System.out.println("");
        //        Write a program to count the number of words in a string
        String s = "indore city is a clean city";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        System.out.println("total word count : "+(c+1));
        System.out.println("");

    }
}
