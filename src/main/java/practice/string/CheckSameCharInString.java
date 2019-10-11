package practice.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSameCharInString {

    private static void sameCharsStrings(String s1, String s2){

        Set<Character> set1 = new HashSet<Character>();
        for (char c : s1.toCharArray()){
            set1.add(c);
        }

        Set<Character> set2 = new HashSet<Character>();
        for (char c : s2.toCharArray()){
            set2.add(c);
        }
        System.out.println(set1.equals(set2));

    }

    public static void main(String[] args) {

            sameCharsStrings("abc", "cba");
            sameCharsStrings("aabbcc", "abc");
            sameCharsStrings("abcd", "abc");
            sameCharsStrings("11", "1122");
            sameCharsStrings("1122", "11");
    }

}
