public class StringCompression {

    public static String compress(String str) {
        String newstr = "";

        //aaabc
        for(int i = 0;i < str.length();i++) { //O(n)
            Integer count = 1;
            while(i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String args[]) {
        String str = "aaabbbccccddd";
        System.out.println(compress(str));
    }
}