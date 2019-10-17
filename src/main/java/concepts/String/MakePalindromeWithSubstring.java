package concepts.String;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Find out minimum changes to make the given String palindrome and it should also include the Given String
 *
 * You are allowed to use only operation
 *
 *
 */



public class MakePalindromeWithSubstring {

    public static void main(String[] args) {

        Set<Integer> result = new TreeSet<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scanner.nextLine();
        System.out.println("Enter the SubString : ");
        String subString = scanner.nextLine();











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
