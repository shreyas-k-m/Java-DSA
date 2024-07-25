import java.util.*;

public class Strings {

    /*public static void main(String args[]) {
        char arr[] = {'s','b','c'};
        String str1 = "abcd";
        String str2 = new String("abcd");

        //input using string
        /*Scanner SC = new Scanner(System.in);
        String name;
        name = SC.nextLine();
        System.out.println(name);
        System.out.println(name.length());*/  //.length() used to get length 

        //concatenation
       /* String firstname = "Shreyas";
        String lastname = "K M";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.charAt(0)); //charAt is used to get first letter*
    }*/
        //substring
        public static String substring(String str11,int si,int ei) {
            String substr = "";
            for(int i = si;i < ei;i++) {
                substr += str11.charAt(i);
            }
            return substr;
        }
        public static void main(String args[]) {
        String str11  = "HelloWorld";
        System.out.println(str11.substring(0,5)); //inbuilt java function
        System.out.println(substring(str11,0,5));

        {
            //string builder
            StringBuilder sb = new StringBuilder("");
            for(char ch = 'a';ch <= 'z';ch++) {
                sb.append(ch);
            }
            System.out.println(sb);
        }
        }
}
        