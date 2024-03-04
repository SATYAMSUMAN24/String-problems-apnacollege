// check two strings are anagrams or not.
import java.util.*;
public class solution4 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 ="heart";

        // covert string to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toUpperCase();

        // first order - if the lengths are the same

        if(str1.length() == str2.length()) {
            // convert string into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // short the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
            else {
                // case when length are not equal
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
    }
}
