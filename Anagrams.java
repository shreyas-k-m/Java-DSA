import java.util.Arrays;
public class Anagrams{
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        //convert strings to lowercase why? so that we dont have to check seperately for low and upper.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check if the lengths are same
        if(str1.length() == str2.length()) {
            //convertstrings to char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or identical the the strings are anagram
            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result) {
                System.out.println(str1 + " and " + str2 +" are anagrams of each other.");
            } else{
                System.out.println(str1 + " and " + str2 +" are not anagrams of each other.");
            }
            }else {
                //case when lengths are not equal
                System.out.println(str1 + " and " + str2 +" are not anagrams of each other.");
            }
        }
    }