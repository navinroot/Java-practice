package concepts.String;

import org.apache.commons.lang3.StringUtils;

/**
 * For a Given String find the longest SubString in given String
 *
 *
 */


public class LongestPalindromeSubString {

    public static void main(String[] args) {







    }







    private static boolean checkPalindrome(String str){
        if(StringUtils.isBlank(str)){
            System.out.println(str+" is not palindrome");
            return false;
        }
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            if(chars[i] != chars[chars.length-i-1]){
                System.out.println(str+" is not palindrome");
                return false;
            }
        }
        System.out.println(str+" is palindrome");
        return true;
    }
}
